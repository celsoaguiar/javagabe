import javax.swing.JFrame;

public class AnimationRunner
{
	public static void main(String [] args)
	{
		JFrame fr = new JFrame("Outer Space Scene");
		Animation a = new Animation();
		fr.add(a);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.pack();
		fr.setVisible(true);
		a.animate();
	}
}