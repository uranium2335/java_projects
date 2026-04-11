import java.util.ArrayList;

public class people {
    String name;
    int age;

    public people(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " " + age;
    }

    // thing in thebrackets are the things that
    // will be used when the method is being exicuted
    public static void printALL(ArrayList<people>guests){
        for(people p : guests){
            System.out.println(p);
        }
    }
    public static void searchguests(ArrayList<people>guests, String searchname){
        for(people p : guests){
            if(p.name.equals(searchname)){
                System.out.println(p);
            }
        }
    }
}
