import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<people> guests = new ArrayList<>();
        // generated objects
        guests.add(new people("ben", 16));
        guests.add(new people("ben", 17));
        guests.add(new people("ben", 18));   // 3 ben entries
        guests.add(new people("max", 14));
        guests.add(new people("max", 15));   // 2 max entries
        guests.add(new people("alex", 18));
        guests.add(new people("alex", 19));
        guests.add(new people("alex", 20));
        guests.add(new people("alex", 21));  // 4 alex entries
        guests.add(new people("sam", 20));
        guests.add(new people("sam", 21));   // 2 sam entries
        guests.add(new people("morgan", 17));
        guests.add(new people("morgan", 18));
        guests.add(new people("morgan", 19));
        guests.add(new people("morgan", 20));
        guests.add(new people("morgan", 21)); // 5 morgan entries
        guests.add(new people("jordan", 15));
        guests.add(new people("jordan", 16)); // 2 jordan entries
        guests.add(new people("taylor", 19));
        guests.add(new people("taylor", 20)); // 2 taylor entries

        Scanner sc = new Scanner(System.in);
        String admin = "ben";
        int admin_age = 16;

        while(true){
            System.out.println("-----log in-----");
            System.out.print("enter name: ");
            String name = sc.nextLine();
            System.out.print("enter age: ");
            int age = sc.nextInt();

            sc.nextLine(); // clears next line

            System.out.println("DEBUG name=[" + name + "] age=[" + age + "]");

            // admin entering commands
            if((name.equals(admin)) && (age == admin_age)){
                while(true){
                    String entered = "";
                    int Nentered = 0;

                    System.out.println("-----Menu-----");
                    System.out.println("1. adding");
                    System.out.println("2. remove");
                    System.out.println("3. done");

                    entered = sc.nextLine();
                    if(entered.equals("done")){
                        for(people p : guests){
                            System.out.println(p);
                        }
                        break;
                    }

                    else if(entered.equals("adding")){
                        System.out.print("name: ");
                        name = sc.nextLine();

                        System.out.print("age: ");
                        age = sc.nextInt();
                        sc.nextLine();

                        guests.add(new people(name, age));
                        for(people p : guests){
                            System.out.println(p);
                        }
                    }

                    else if(entered.equals("remove")){
                        System.out.print("what person: ");
                        String searchname = sc.nextLine();

                        for(people p : guests){
                            if(p.name.equals(searchname)){
                                System.out.println(p);
                            }
                        }

                        System.out.print("enter age: ");
                        int searchage = sc.nextInt();
                        sc.nextLine();
                        // p -each object in the list
                        // -> - do this with p
                        // p.name -condition to check
                        // result -true = remove it
                        guests.removeIf(p -> p.name.equals(searchname) && p.age == searchage);

                        for(people p : guests){
                            System.out.println(p);
                        }
                    }
                }
                System.out.println("----admin log-out----");
            }
        }
    }
}
