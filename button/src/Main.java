import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] arg) {

        JFrame frame = new JFrame();
        frame.setTitle("Title u can change it");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setLayout(null); // allows manual positioning
        frame.getContentPane().setBackground(Color.blue);

        // Create button
        JButton button = new JButton("Click Me");
        button.setBounds(150,150,120,40); // x, y, width, height

        // Add function to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                frame.getContentPane().setBackground(Color.red);
            }
        });

        // Add button to frame
        frame.add(button);

        frame.setVisible(true);
    }
}
