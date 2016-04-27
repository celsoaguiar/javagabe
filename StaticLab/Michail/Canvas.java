import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.Dimension;

public class Canvas extends JPanel
{
	private BufferedImage buffered;
	private int x = 100;
	private int y = 100;
	private String mouseStatus = "";
	
	//Instantiate Input
	private Input input; 
	
	public Canvas()
	{
		input = new Input(this);
	}

	
	public Dimension getPreferredSize() 
	{
		//Sets the size of the panel
        return new Dimension(800,600);
		
	}
	
	public void paintComponent(Graphics g) 
	{
		if(buffered==null)
			buffered = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics gBuff = buffered.createGraphics();
		

		//draw background
		gBuff.setColor(Color.WHITE);
		gBuff.fillRect(0, 0, 800, 600);

		//draw red oval
		gBuff.setColor(Color.RED);
		gBuff.fillOval(x, y, 50, 50);
		
		//draw mouse status
		Font font = new Font("Arial", Font.PLAIN, 25);
		gBuff.setFont(font);
		gBuff.setColor(Color.BLUE);
		gBuff.drawString(mouseStatus, 100, 300);


		//draw buffered 
		g.drawImage(buffered, 0, 0, null);
    
	}
	
	public void animate()
	{
		while(true)
		{
            try{ 
                Thread.sleep(33); 
            }catch(InterruptedException ex){ 
                Thread.currentThread().interrupt(); 
            }
			
			if(Input.keyboard[40]) 
			{
				y+=5;
			}
			if(Input.keyboard[38])
			{
				y-=5;
			}
			if(Input.keyboard[37])
			{			
				x-=5;
			}
			if(Input.keyboard[39]) 
			{
				x+=5;
			}
			
			if( Input.clicked && Input.mouseButtons[0] )
			{
				mouseStatus = "You pressed the left button at " + Input.x + ", " + Input.y;
			}
			else if( Input.clicked == false && Input.mouseButtons[0] == false )
			{
				mouseStatus = "You released the left button at " + Input.x + ", " + Input.y;
			}
			
            repaint();
		}
	}
}

