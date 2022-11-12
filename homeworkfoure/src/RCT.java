import javax.swing.*;
import java.awt.*;

public class RCT {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setBackground(Color.BLACK);
        frame.setTitle("NAME");
        frame.setSize(400,400);

      //  frame.setBackground(Color.black);
        FaceComponent Component=new FaceComponent();
        frame.add(Component);
        frame.setVisible(true);
    }
}
