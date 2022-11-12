import javax.swing.*;
import java.awt.*;

public class towSquareComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle squre=new Rectangle(0,20,100,100);
        g2.draw(squre);
        g2.fill(squre);
        g2.setColor(Color.MAGENTA);
        Rectangle squre2=new Rectangle(100,20,100,100);
        g2.draw(squre2);
        g2.fill(squre2);
    }

}
