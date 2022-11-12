import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


         import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.geom.Ellipse2D;
 import java.awt.geom.Line2D;
 import javax.swing.JComponent;

         /**
 10 A component that draws an alien face.
  */
         public class FaceComponent extends JComponent
 {
         public void paintComponent(Graphics g)
         {
         // Recover Graphics2D
         Graphics2D g2 = (Graphics2D) g;
         g2.setColor(Color.blue);
         Rectangle rectangle = new Rectangle(44,44, 200, 100);
         g2.draw(rectangle);
        // rectangle.translate(50, 0);
        g2.fill(rectangle);

         // Draw the greeting
         g2.setColor(Color.red);
        g2.drawString("NAJM ADEEN ALI" ,100,100);
    }

    }




