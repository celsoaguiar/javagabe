import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class SportsCar extends MediumCar {
    private Dimensions d = new Dimensions();
    
    public SportsCar(Color color, int x, int y, int speed) {
        super(color, x, y, speed);
    }

    //Override (2 door Frame)
    public void drawFrame(Graphics g) {
        super.drawFrame(g);

		g.setColor(d.black);
        //g.drawLine(posX+25, y+0, posX+35, y+30);
        g.drawLine(posX+75, y+0, posX+75, y+50);
        g.drawLine(posX+125, y+0, posX+115, y+30);
    }
}
