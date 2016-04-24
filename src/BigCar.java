import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class BigCar extends Automobile {
    private Dimensions d = new Dimensions();

    public BigCar(Color color, int x, int y, int speed) {
        super(color, x, y, speed);
    }
    
    // : void ­ Override (Larger size frame with windows and lights)
    public void drawFrame(Graphics g) {
        super.drawFrameLarge(g);
        
        int xpoints[] = {posX+0, posX+10, posX+160, posX+200};
        int ypoints[] = {y+0, y-30, y-30, y+0};
        int npoints = 4;
        g.drawPolygon(xpoints, ypoints, npoints);
        
        g.drawLine(posX+120, y-30, posX+120, y+0);
        
        // lights
        g.setColor(d.yellow);
		g.fillOval(posX+194, y+30, 10, 10);
    }
    
    // : void ­ Override (Larger size frame with windows and lights)
    public void drawFrameBed(Graphics g) {
        super.drawFrameLarge(g);
        
        int xpoints[] = {posX+120, posX+120, posX+160, posX+200};
        int ypoints[] = {y+0, y-30, y-30, y+0};
        int npoints = 4;
        g.drawPolygon(xpoints, ypoints, npoints);
        
        g.drawLine(posX+120, y-30, posX+120, y+0);
        
        // lights
        g.setColor(d.yellow);
		g.fillOval(posX+194, y+30, 10, 10);
    }
    
    // : void ­ Override (More detailed big Wheels)
    public void drawWheels(Graphics g) {
        super.drawWheelsLarge(g);

		g.setColor(d.white);
		g.fillOval(posX+35, y+35, 20, 20);
		g.fillOval(posX+145, y+35, 20, 20);
        
    }
}
