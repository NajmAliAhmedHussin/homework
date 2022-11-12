import javax.swing.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static java.awt.Color.green;
import static java.awt.Color.pink;

public class Q5 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,400);
        JLabel label;
        label = new JLabel("Hello,Najm Ali");

        label.setOpaque(true);
        Color myColor = green;

        frame.getContentPane().setBackground(myColor);
        label.setBackground(myColor);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
