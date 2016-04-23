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
    private Dimensions d = new Dimensions();
	
	public TrafficLab()
	{
		autos = new ArrayList<Automobile>();
		autos.add(new BigCar(d.blue, 0, 200, 2));
		autos.add(new MediumCar(d.red, 100, 300, 3));
		autos.add(new Automobile(d.green, 200, 400, 5));
	}
	
	public Dimension getPreferredSize()
	{
        return new Dimension(d.width, d.height);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (buffered == null) {
			buffered = (BufferedImage)(createImage(getWidth(), getHeight()));
		}
		Graphics gBuf = buffered.createGraphics();
		//background
		gBuf.setColor(d.white);
		gBuf.fillRect(0, 0, d.width, d.height);
		
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
			try {
				Thread.sleep(10);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			
			d.tick();
			
			repaint();
		}
	}
}
