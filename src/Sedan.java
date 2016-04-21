import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

//  Override (4 door Frame) (Use super.drawFrame(Graphics) to draw the frame of the parent and then draw the 4 door Frame)
public class Sedan extends MediumCar {
    
    public Sedan(Color color, int x, int y, int speed) {
        super(color, x, y, speed);
    }

    //Add lights and windows
    public void drawFrame(Graphics g) {
         
    }
}
