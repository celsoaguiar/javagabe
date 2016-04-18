import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class Automobile {
    private int x;
    private int y;
    private int speed;
    private int bodyColor;
    
	private int x1;
	private BufferedImage buffered;
	//star coordinates
	private int [] starsx = new int[200];
	private int [] starsy = new int[200];

    public Automobile(Color color, int x, int y) {
        
    }
    // Draws the wheel and frame by calling its corresponding methods.
    public void drawMe(Graphics g) {

    }
    //Draw a simple wheel
    public void drawWheels(Graphics g) {
        
    }
    //Draw a simple frame.
    public void drawFrame(Graphics g) {
         
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return x;
    }
}
