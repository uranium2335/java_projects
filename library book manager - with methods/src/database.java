import java.util.ArrayList;
import java.util.Scanner;

public class database {
    String title;
    String author;
    boolean instock;

    database(String title, String author, boolean instock){
        this.title = title;
        this.author = author;
        this.instock = instock;
    }

    public String toString(){
        return title + ", " + author + ", " + instock;
    }

    public static void showAvalable(ArrayList<database> books){
        for(database d : books){
            if(d.instock == true){
                System.out.println(d);
            }
        }
    }
    public static void showOutOfStock(ArrayList<database>books){
        for(database d : books){
            if(d.instock == false){
                System.out.println(d);
            }
        }
    }
    public static void returnBoook(ArrayList<database>books, String answer, Scanner sc){
        for(database d : books){
            if(d.title.equals(answer)){
                System.out.println(d);
                System.out.print("returned :");
                String returned = sc.nextLine();
                if(returned.equals("yes")){
                    d.instock = true;
                    System.out.println(d);
                }
            }
        }
    }
    public static void borrowBook(ArrayList<database>books, String answer, Scanner sc){
        for(database d : books){
            if(d.title.equals(answer)){
                System.out.println(d);
                System.out.print("borrowed: ");
                String borrowed = sc.nextLine();
                if(borrowed.equals("yes")){
                    d.instock = false;
                    System.out.println(d);
                }
            }
        }
    }
    public static void printByAuthor(ArrayList<database>books, String author){
        for(database d : books){
            if(d.author.equals(author)){
                System.out.println(d);
            }
        }
    }
 }
