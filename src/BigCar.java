import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class BigCar extends Automobile {
    private Dimensions d = new Dimensions();

    public BigCar(Color color, int x, int y, int speed) {
        super(color, x, y, speed);
    }
    
    // : void ­ Override (Larger size frame with windows and lights)
    public void drawFrame(Graphics g) {
        super.drawFrame(g);
        
        //g.setStroke(new BasicStroke(3));
        int xpoints[] = {posX+0, posX+0, posX+120, posX+150};
        int ypoints[] = {y+0, y-30, y-30, y+0};
        int npoints = 4;
        g.drawPolygon(xpoints, ypoints, npoints);
        
        g.drawLine(posX+110, y-30, posX+110, y+0);
    }
    
    // : void ­ Override (More detailed big Wheels)
    public void drawWheels(Graphics g) {
        super.drawWheels(g);

		g.setColor(d.white);
		g.fillOval(posX+25, y+35, 20, 20);
		g.fillOval(posX+105, y+35, 20, 20);            
    }
    
}
