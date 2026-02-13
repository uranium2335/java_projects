import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner Scanner = new Scanner(System.in);
        // Create a list of Strings
        ArrayList<String> names = new ArrayList<>();

        names.add("bill");
        names.add("ian");
        names.add("ben");
        names.add("sam");
        names.add("fin");

        for(String i : names){
            System.out.println(i + " ");
        }
    }
}