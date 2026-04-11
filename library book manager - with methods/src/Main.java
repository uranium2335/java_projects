import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<database>books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        books.add(new database("The Hobbit", "J.R.R. Tolkien", false));
        books.add(new database("1984", "George Orwell", false));

        books.add(new database("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", false));
        books.add(new database("Harry Potter and the Chamber of Secrets", "J.K. Rowling", true));

        books.add(new database("The Catcher in the Rye", "J.D. Salinger", false));
        books.add(new database("To Kill a Mockingbird", "Harper Lee", true));
        books.add(new database("The Great Gatsby", "F. Scott Fitzgerald", false));
        books.add(new database("Moby Dick", "Herman Melville", false));
        books.add(new database("The Lord of the Rings", "J.R.R. Tolkien", false));
        books.add(new database("The Fellowship of the Ring", "J.R.R. Tolkien", true));
        books.add(new database("The Two Towers", "J.R.R. Tolkien", false));
        books.add(new database("The Return of the King", "J.R.R. Tolkien", false));
        books.add(new database("Brave New World", "Aldous Huxley", true));
        books.add(new database("Fahrenheit 451", "Ray Bradbury", false));
        books.add(new database("The Alchemist", "Paulo Coelho", true));
        books.add(new database("The Da Vinci Code", "Dan Brown", false));
        books.add(new database("Angels & Demons", "Dan Brown", true));
        books.add(new database("The Hunger Games", "Suzanne Collins", false));

        // false means it's not in stock
        // true means it's in stock
        System.out.println("-----Menu-----");
        System.out.println("1. show available");
        System.out.println("2. show borrowed ");
        System.out.println("3. return book");
        System.out.println("4. borrow book");
        System.out.println("5. see books by author");
        System.out.print("enter a number from menu:");
        String menu = sc.nextLine().trim();

        if(menu.equals("1")){
            database.showAvalable(books);
        }
        else if(menu.equals("2")){
            database.showOutOfStock(books);
        }
        else if(menu.equals("3")){
            System.out.print("enter book name: ");
            String answer = sc.nextLine();
            // System.out.println(answer);
            database.returnBoook(books, answer, sc);
        }
        else if(menu.equals("4")){
            System.out.print("enter book name: ");
            String answer = sc.nextLine();
            database.borrowBook(books, answer, sc);
        }
        else if(menu.equals("5")){
            System.out.print("enter author: ");
            String author = sc.nextLine();
            database.printByAuthor(books, author);
        }

    }
}
