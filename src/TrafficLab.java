import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class TrafficLab extends JPanel
{
	private int x;
	private int x1;
	private BufferedImage buffered;
	//star coordinates
	private int [] starsx = new int[200];
	private int [] starsy = new int[200];
	public TrafficLab()
	{
		Random generator = new Random();
		for(int x = 0; x < 200; x++)
		{
			starsx[x] = generator.nextInt(1200);
			starsy[x] = generator.nextInt(600);
		}
	}
	public Dimension getPreferredSize()
	{
		Dimension windowSize = new Dimension(1200,600);
        return windowSize;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(buffered == null)
		{
			buffered = (BufferedImage)(createImage(getWidth(), getHeight()));
		}
		Graphics gBuf = buffered.createGraphics();
		Color black = new Color(0, 0, 0);
		Color gray = new Color(121, 90, 90);
		Color white = new Color (255, 255, 255);
		Color darkgray = new Color (32, 32, 32);
		Color lightgray = new Color (160, 160, 160);
		Color yellow = new Color (255, 255, 0);
		Color blue = new Color (51, 51, 255);
		Color green = new Color (0, 204, 0);
		Color red = new Color (102, 51, 0);
		
		//background
		gBuf.setColor(black);
		gBuf.fillRect(0, 0, 1200, 600);

		
		//satellite
		Double satx = (x1) + 1.0;
		int isatx = x1;
		Double saty = 150.0;
		int isaty = saty.intValue();
				
		gBuf.setColor(blue);
		gBuf.fillRect(isatx, isaty, 150, 50);
		
		gBuf.setColor(gray);
		gBuf.fillOval(isatx+20, isaty+30, 30, 30);
		gBuf.fillOval(isatx+100, isaty+30, 30, 30);

		g.drawImage(buffered, 0, 0, null);
	}
	public void animate()
	{
		while(true)
		{
			x1 = 0;
			int count = 0;
			while(count <1080)
			{
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				x1++;
				count++;
				repaint();
			}
		}
	}
}
