import javax.swing.JFrame;

public class TrafficLabRunner
{
	public static void main(String [] args)
	{
		JFrame fr = new JFrame("Outer Space Scene");
		TrafficLab a = new TrafficLab();
		fr.add(a);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.pack();
		fr.setVisible(true);
		a.animate();
	}
}