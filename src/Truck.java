import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

// : void ­ Override (2 door Frame with a bed)
public class Truck extends BigCar {
    private Dimensions d = new Dimensions();

    public Truck(Color color, int x, int y, int speed) {
        super(color, x, y, speed);
    }

    public void drawFrame(Graphics g) {
        super.drawFrameBed(g);

        g.setColor(d.black);
        //g.drawLine(posX+75, y+0, posX+75, y+50);
        g.drawLine(posX+120, y+0, posX+120, y+50);
        g.drawLine(posX+175, y+0, posX+150, y+30);
    }
}