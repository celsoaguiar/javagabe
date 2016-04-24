import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.*;
import java.awt.image.BufferedImage;

public class TrafficLab extends JPanel
{	
	private BufferedImage buffered;
	private ArrayList<Automobile> autos; 
    private Dimensions d = new Dimensions();
	private int[] autoY = { 90, 200, 305, 470, 580, 680 };

	public TrafficLab()
	{
		autos = new ArrayList<Automobile>();
		
		autos.add(new SportsCar(d.lightgray, -100, 90, 1));
		autos.add(new SUV(d.gray, 200, 90, 3));
		autos.add(new Sedan(d.blue, 400, 90, 2));
		
		autos.add(new Truck(d.green, 100, 200, 5));
		autos.add(new Sedan(d.blue, 500, 200, 4));
		autos.add(new Sedan(d.green, 400, 200, 2));
		
		autos.add(new Truck(d.lightgray, 800, 305, 6));
		autos.add(new SportsCar(d.red, -100, 305, 3));
		autos.add(new SUV(d.red, -400, 305, 4));
		autos.add(new SportsCar(d.gray, -200, 305, 7));
		
		autos.add(new SUV(d.green, 300, 470, 3));
		autos.add(new Sedan(d.gray, 200, 470, 5));
		autos.add(new SUV(d.lightgray, 100, 470, 2));
		
		autos.add(new Sedan(d.gray, -200, 580, 3));
		autos.add(new SUV(d.red, 50, 580, 2));
		autos.add(new Truck(d.green, -400, 580, 4));
		autos.add(new SportsCar(d.lightgray, -100, 580, 1));
		
		autos.add(new Truck(d.yellow, 100, 680, 4));
		autos.add(new SportsCar(d.black, -500, 680, 3));
		autos.add(new Truck(d.red, -300, 680, 5));
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
		
		collisionCheck(g);
		
		g.drawImage(buffered, 0, 0, null);
		
		// Draw the roads
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(d.black);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(0, 50, d.width, 50);
		g2.drawLine(0, d.height/2-30, d.width, d.height/2-30);
		g2.drawLine(0, d.height/2+30, d.width, d.height/2+30);
		g2.drawLine(0, d.height-50, d.width, d.height-50);
		
		Stroke dashed = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{20}, 0);
        g2.setStroke(dashed);
		g2.setColor(d.yellow);
        g2.drawLine(0, 160, d.width, 160);
        g2.drawLine(0, 270, d.width, 270);
        g2.drawLine(0, 540, d.width, 540);
        g2.drawLine(0, 647, d.width, 647);

	}
	
	void collisionCheck(Graphics g) {
		for (int y : autoY) {
			for (Automobile auto : autos) {
				int yy = auto.getY();
				if (y == yy) {
					
				}
			}
		}
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
