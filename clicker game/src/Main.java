import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
    static double money = 0;
    static double up1cost = 25;
    static double multi = 1;

    static JButton upgrade1 = new JButton("upgrade 1 cost: "+ up1cost);
    public static void main(String[] arg){

        // window
        JFrame frame = new JFrame("Clicker Game");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.gray);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // text display
        JLabel money_display = new JLabel(String.valueOf(money));
        // money_display.setBounds(200,10,300,100);
        money_display.setFont(new Font("Arial", Font.BOLD,40));
        money_display.setForeground(Color.blue);
        money_display.setOpaque(true);
        money_display.setBackground(Color.pink);
        frame.add(money_display);

        // money button
        JButton clicker = new JButton("Get Money");
        // clicker.setBounds(10,10,100,40);
        clicker.setBackground(Color.red);
        frame.add(clicker);

        clicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                money += 1 * multi;
                System.out.println("clicker clicked money +1");
                System.out.println(money);
                money_display.setText(String.valueOf(money));
                if(money >= up1cost){
                    upgrade1.setEnabled(true);
                }
            }
        });

        // upgrade money
        // JButton upgrade1 = new JButton("upgrade 1");
        upgrade1.setBackground(Color.green);
        upgrade1.setEnabled(false);
        // upgrade1.setBounds(10,70,100,40);
        frame.add(upgrade1);

        upgrade1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("upgrade 1 cost: "+ up1cost);
                money -= up1cost;
                multi += 0.5;
                up1cost = up1cost*1.1;

                System.out.println(money);
                money_display.setText(String.valueOf(money));
                upgrade1.setText(String.valueOf(up1cost));
                if(money <= up1cost-1){
                    upgrade1.setEnabled(false);
                }
            }
        });

        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int width = frame.getWidth();
                int height = frame.getHeight();

                money_display.setBounds(
                        (int)(width * 0.4),
                        (int)(height * 0.02),
                        (int)(width * 0.6),
                        (int)(height * 0.2)
                );
                clicker.setBounds(
                        (int)(width * 0.02),
                        (int)(height * 0.02),
                        (int)(width * 0.2),
                        (int)(height * 0.08)
                );
                upgrade1.setBounds(
                        (int)(width * 0.02),
                        (int)(height * 0.12),
                        (int)(width * 0.2),
                        (int)(height * 0.08)
                );
            }
        });
    }
}