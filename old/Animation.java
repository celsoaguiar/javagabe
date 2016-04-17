import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.image.BufferedImage;

public class Animation extends JPanel
{
	private int x;
	private int x1;
	private BufferedImage buffered;
	//star coordinates
	private int [] starsx = new int[200];
	private int [] starsy = new int[200];
	public Animation()
	{
		Random generator = new Random();
		for(int x = 0; x < 200; x++)
		{
			starsx[x] = generator.nextInt(800);
			starsy[x] = generator.nextInt(600);
		}
	}
	public Dimension getPreferredSize()
	{
		Dimension windowSize = new Dimension(800,600);
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
		gBuf.fillRect(0, 0, 800, 600);
		//stars
		gBuf.setColor(white);
		for(x = 0; x < 200; x++)
		{
			gBuf.fillOval(starsx [x], starsy [x], 3, 3);
		}
		//asteroid
		gBuf.setColor(gray);
		gBuf.fillOval(x1 * 2 + 10, x1, 30, 50);
		gBuf.fillOval(x1 * 2 + 10, x1 + 10, 70, 50); 
		gBuf.fillOval(x1 * 2 - 15, x1 + 5, 40, 70);
		//moon
		gBuf.setColor(darkgray);
		gBuf.fillOval(537, 340, 301, 304);
		gBuf.setColor(lightgray);
		gBuf.fillOval(675, 408, 44, 68);
		gBuf.fillOval(667, 496, 61, 38);
		gBuf.fillOval(683, 432, 45, 41);
		gBuf.fillOval(626, 457, 30, 35);
		gBuf.fillOval(572, 516, 63, 45);
		gBuf.fillOval(626, 363, 51, 37);
		gBuf.fillOval(742, 453, 56, 43);
		gBuf.fillOval(686, 557, 64, 37);
		gBuf.fillOval(736, 372, 51, 49);
		//satellite
		Double satx = (Math.cos(Math.toRadians(x1))) * 200 + 250;
		int isatx = satx.intValue();
		Double saty = (Math.sin(Math.toRadians(x1))) * 125 + 350;
		int isaty = saty.intValue();
		gBuf.setColor(white);
		gBuf.fillOval(isatx, isaty, 60, 80);
		gBuf.fillRect(isatx - 50, isaty + 50, 165, 15);
		gBuf.fillRect(isatx - 50, isaty + 20, 165, 15);
		//sun
		gBuf.setColor(yellow);
		gBuf.fillOval(700, 100, 30, 30);
		//earth
		Double earthx = (Math.cos(Math.toRadians(x1))) * 400 + 443 + 200;
		int iearthx = earthx.intValue();
		Double earthy = (Math.sin(Math.toRadians(x1))) * 400 + 47 + 50;
		int iearthy = earthy.intValue();
		gBuf.setColor(blue);
		gBuf.fillOval(iearthx, iearthy, 115, 114);
		gBuf.setColor(green);
		gBuf.fillOval(iearthx + 17, iearthy + 29, 21, 56);
		gBuf.fillOval(iearthx + 73, iearthy + 18, 24, 27);
		gBuf.fillOval(iearthx + 84, iearthy + 23, 19, 48);
		gBuf.fillOval(iearthx + 78, iearthy + 31, 25, 59);
		gBuf.fillOval(iearthx + 38, iearthy + 7, 29, 27);
		gBuf.fillOval(iearthx + 18, iearthy + 67, 37, 27);
		gBuf.fillOval(iearthx + 33, iearthy + 47, 34, 28);
		//mars
		Double marsx = (Math.cos(Math.toRadians(x1))) * 450 + 188 + 350;
		int imarsx = marsx.intValue();
		Double marsy = (Math.sin(Math.toRadians(x1))) * 450 + 316;
		int imarsy = marsy.intValue();
		gBuf.setColor(red);
		gBuf.fillOval(imarsx, imarsy, 76, 74);
		gBuf.setColor(lightgray);
		gBuf.fillOval(imarsx + 43, imarsy + 21, 19, 31);
		gBuf.fillOval(imarsx + 17, imarsy + 46, 25, 18);
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