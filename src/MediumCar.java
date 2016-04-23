import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class MediumCar extends Automobile {
    private Dimensions d = new Dimensions();

    public MediumCar(Color color, int x, int y, int speed) {
        super(color, x, y, speed);
    }

    //Add lights and windows
    public void drawFrame(Graphics g) {
        super.drawFrame(g);
        
        //g.setStroke(new BasicStroke(3));
        int xpoints[] = {posX+25, posX+40, posX+110, posX+125};
        int ypoints[] = {y+0, y-30, y-30, y+0};
        int npoints = 4;
        g.drawPolygon(xpoints, ypoints, npoints);
        
        g.drawLine(posX+75, y-30, posX+75, y+0);
    }
    
    //More detailed Wheels (add a hubcap)
    public void drawWheels(Graphics g) {
        super.drawWheels(g);

		g.setColor(d.white);
		g.fillOval(posX+25, y+35, 20, 20);
		g.fillOval(posX+105, y+35, 20, 20);
    }
}
