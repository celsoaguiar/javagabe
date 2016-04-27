import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.awt.image.BufferedImage;

public class Screen {
    private static Dimensions instance = null;
    public static int berryCount = 0;
    public static int player1count = 0;
    public static int player2count = 0;
    
    private GameManager() {
        
    }

    public int getTotal() {      
        return player1count + player2count;
    }
   
    public int berriesLeft() {
        return berryCount;
    }
    
    public void reset() {
        this.berryCount = random(5) + 10;
        this.player1count = 0;
        this.player2count = 0;
    }
}