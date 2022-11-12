import javax.swing.*;
import java.awt.*;

public class Q9 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(300,300);
frame.setBackground(Color.getColor("purple"));
        frame.setTitle("Chess");
        draw_chess Component=new draw_chess();
        frame.add(Component);
        frame.setVisible(true);
    }
}
