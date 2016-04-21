import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class Automobile {
    private int posX = 0;
    private int x;
    private int y;
    private int speed = 8;
    private Color bodyColor;
    private Color tireColor = new Color(0, 0, 0);
    private Dimensions dimensions = new Dimensions();

    public Automobile(Color color, int x, int y, int speed) {
        this.bodyColor = color;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    
    // Draws the wheel and frame by calling its corresponding methods.
    public void drawMe(Graphics g) {
		drawFrame(g);
        drawWheels(g);
        calc();
    }
    //Draw a simple wheel
    public void drawWheels(Graphics g) {
		g.setColor(tireColor);
		g.fillOval(posX+20, y+30, 30, 30);
		g.fillOval(posX+100, y+30, 30, 30);            
    }
    //Draw a simple frame.
    public void drawFrame(Graphics g) {
        g.setColor(bodyColor);
		g.fillRect(posX, y, 150, 50);         
    }

    public void calc() {
        posX = (dimensions.ticker * speed + x) % dimensions.width;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return x;
    }
}
