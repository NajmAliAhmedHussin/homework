import javax.swing.*;
import java.awt.*;

public class draw_chess extends JComponent
{
    public void paintComponent(Graphics g)
    {
int col,row,x,y;
        for ( row= 0;row <9 ; row++)
        {
            for (col = 0;  col<8 ; col++) {
                x=col*22;
                y=row*22;
if ((row%2)==(col%2))
    g.setColor(Color.WHITE);
else
    g.setColor(Color.black);
g.fillRect(x,y,22,22);
            }
        }

        }
    }

