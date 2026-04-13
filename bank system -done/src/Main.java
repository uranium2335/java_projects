
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<bankSystem> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        accounts.add(new bankSystem("max",6767, 100));
        accounts.add(new bankSystem("bill",2468, 200));
        accounts.add(new bankSystem("tom",1357, 300));

        while(true){
            System.out.println("_____Menu_____");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. show all accounts");
            System.out.println("5. transfer money");
            System.out.print("enter number from menu:");

            String innerMenu = sc.nextLine();

            if(innerMenu.equals("1")){
                System.out.print("enter name: ");
                String name = sc.nextLine();
                System.out.print("create account number: ");
                int accountNumber = sc.nextInt();
                sc.nextLine();
                while(bankSystem.uniquNumber(accounts, accountNumber) == false ){
                    System.out.print("create account number: ");
                    accountNumber = sc.nextInt();
                    sc.nextLine();
                }
                System.out.print("enter starting balance: ");
                double newbalance = sc.nextDouble();
                sc.nextLine(); // clears the scanner

                bankSystem.CreateAccount(accounts, name, accountNumber, newbalance);
                System.out.println(name + ", " + newbalance + ", " + accountNumber);
            }
            else if(innerMenu.equals("2")){
                System.out.print("enter account number: ");
                int enterAccNum = sc.nextInt();
                sc.nextLine();
                bankSystem.depositMoney(accounts, enterAccNum, sc);

            }
            else if(innerMenu.equals("3")){
                System.out.print("enter account number: ");
                int enterAccNum = sc.nextInt();
                sc.nextLine();
                System.out.print("withdraw amount: ");
                double withdrawAmount = sc.nextDouble();
                sc.nextLine();
                if(bankSystem.withdrawcheck(accounts, enterAccNum, withdrawAmount, sc) == true){
                    bankSystem.withrawMoney(accounts, enterAccNum, withdrawAmount, sc);
                }
            }
            else if(innerMenu.equals("4")){
                bankSystem.showAccounts(accounts);
            }
            else if(innerMenu.equals("5")){
                System.out.print("enter senders account number: ");
                int enterAccNum = sc.nextInt();
                sc.nextLine();
                System.out.print("enter receivers account number: ");
                int receiversNum = sc.nextInt();
                sc.nextLine();
                System.out.print("enter transfer amount: ");
                double withdrawAmount = sc.nextDouble();
                sc.nextLine();
                if(bankSystem.withdrawcheck(accounts, enterAccNum, withdrawAmount, sc) == true){
                    bankSystem.transferProcess(accounts, enterAccNum, receiversNum, withdrawAmount);
                }
            }
        }
    }
}
