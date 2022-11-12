import javax.swing.*;

public class twoSquareViewer {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(300,300);
        frame.setTitle("TOW RCTANGLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        towSquareComponent Component=new towSquareComponent();
        frame.add(Component);
        frame.setVisible(true);
    }
}
