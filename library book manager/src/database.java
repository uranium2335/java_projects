import java.util.ArrayList;

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
 }
