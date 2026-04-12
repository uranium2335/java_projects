import java.util.Scanner;
import java.util.ArrayList;

public class bankSystem {
    String name;
    double starting_balance;
    int account_number;

    bankSystem(String name, int account_number, double starting_balance){
        this.name = name;
        this.account_number = account_number;
        this.starting_balance = starting_balance;
    }
    public String toString(){
        return "account name: " + name + ", account balance: " + starting_balance + ", " + account_number;
    }


    public static boolean uniquNumber(ArrayList<bankSystem>account, double accountNumber){
        for(bankSystem b : account){
            if(accountNumber == b.account_number){
                return false;
            }
        }
        return true;
    }
    public static void CreateAccount(ArrayList<bankSystem>accounts, String name, int accountNumber, double newbalnce){
        accounts.add(new bankSystem(name, accountNumber, newbalnce));

    }

    public static void depositMoney(ArrayList<bankSystem>accounts, int enterAccNum, Scanner sc){
        for(bankSystem b : accounts){
            if(b.account_number == enterAccNum){
                System.out.println("----------");
                System.out.println(b);
                System.out.println("----------");
                System.out.print("deposit amount: ");
                double deposited = sc.nextDouble();
                sc.nextLine();
                b.starting_balance = b.starting_balance + deposited;
                System.out.println("----------");
                System.out.println(b);
                System.out.println("----------");
            }
        }
    }

    public static boolean withdrawcheck(ArrayList<bankSystem>accounts, int enterAccNum, double withdrawAmount, Scanner sc){
        for(bankSystem b : accounts){
            if(b.account_number == enterAccNum){
                double withdrawn = b.starting_balance-withdrawAmount;
                if(withdrawn < 0){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    public static void withrawMoney(ArrayList<bankSystem>accounts, int enterAccNum, double withdrawAmount, Scanner sc){
        for(bankSystem b : accounts){
            if(b.account_number == enterAccNum){
                b.starting_balance = b.starting_balance-withdrawAmount;
                System.out.println("----------");
                System.out.println(b);
                System.out.println("----------");
            }
        }
    }

    public static void showAccounts(ArrayList<bankSystem>accounts){
        for(bankSystem b : accounts){
            System.out.println("name: " + b.name + ", account number: " + b.account_number);
        }
    }
}
