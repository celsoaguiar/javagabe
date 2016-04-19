import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.awt.image.BufferedImage;

public class TrafficLab extends JPanel
{
	private int x;
	private BufferedImage buffered;
	private ArrayList<Automobile> autos; 
	
	Color black = new Color(0, 0, 0);
	Color gray = new Color(121, 90, 90);
	Color white = new Color (255, 255, 255);
	Color darkgray = new Color (32, 32, 32);
	Color lightgray = new Color (160, 160, 160);
	Color yellow = new Color (255, 255, 0);
	Color blue = new Color (51, 51, 255);
	Color green = new Color (0, 204, 0);
	Color red = new Color (102, 51, 0);
		
	public TrafficLab()
	{
		autos = new ArrayList<Automobile>();
		autos.add(new Automobile(blue, 0, 0));
	}
	
	public Dimension getPreferredSize()
	{
		Dimension windowSize = new Dimension(1200,600);
        return windowSize;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (buffered == null) {
			buffered = (BufferedImage)(createImage(getWidth(), getHeight()));
		}
		Graphics gBuf = buffered.createGraphics();
		//background
		gBuf.setColor(white);
		gBuf.fillRect(0, 0, 1200, 600);
		
		// Draw all cars		
		for (Automobile auto : autos) {
			auto.drawMe(gBuf);
        }
			
		g.drawImage(buffered, 0, 0, null);
	}
	
	public void animate()
	{
		while(true)
		{
			int count = 0;
			
			while(count < 1080)
			{
				try {
					Thread.sleep(10);
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				
				count++;
				
				repaint();
			}
		}
	}
}
