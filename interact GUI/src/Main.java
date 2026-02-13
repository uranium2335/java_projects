import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    static int number = 0;

    public static void main(String[] arg){
        JFrame frame = new JFrame();
        frame.setVisible(true);

        frame.setTitle("free hand");
        frame.getContentPane().setBackground(Color.blue);
        frame.setSize(500,500);
        frame.setLayout(null); // allows custom positioning of text boxes and buttons etc
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // text box
        JTextField textbox = new JTextField(String.valueOf(number));
        textbox.setBounds(150,20,120,100);
        textbox.setVisible(true);
        textbox.setEditable(false);
        textbox.setFont(new Font("Arial", Font.PLAIN, 40));

        // button
        JButton button = new JButton("click me");
        button.setBounds(150,150,120,40);
        button.setBackground(Color.pink);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number +=1 ;
                System.out.println("iv been clicked!" + number +" times");
                textbox.setText(String.valueOf(number));
            }
        });

        frame.add(button);
        frame.add(textbox);
    }
}