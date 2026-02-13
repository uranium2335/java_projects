import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] arg){
        // creates a pop_up with text box and will always come out as a string
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        // converting the string into an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you"));
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");

        // converting the string into an integer
        double tall = Double.parseDouble(JOptionPane.showInputDialog("how tall are you"));
        JOptionPane.showMessageDialog(null, "you are " + tall + " cm");

    }
}