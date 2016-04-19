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