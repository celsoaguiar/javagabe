import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.awt.image.BufferedImage;

public class Dimensions {
    private static Dimensions instance = null;
    public static int width = 2000;
    public static int height = 800;
    public static int ticker = 0;
    
    public Color black = new Color(0, 0, 0);
	public Color gray = new Color(121, 90, 90);
	public Color white = new Color (255, 255, 255);
	public Color darkgray = new Color (32, 32, 32);
	public Color lightgray = new Color (160, 160, 160);
	public Color yellow = new Color (255, 255, 0);
	public Color blue = new Color (51, 51, 255);
	public Color green = new Color (0, 204, 0);
	public Color red = new Color (102, 51, 0);
        
    protected Dimensions() {
        // Exists only to defeat instantiation.
    }
   
    public static Dimensions getInstance() {
        if (instance == null) {
            instance = new Dimensions();
        }
      
        return instance;
    }
   
    public int tick() {
        return ticker++;
    }
}