package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SquarePattern extends JPanel {
	@SuppressWarnings("unused")
	private final Random rand = new Random();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Random rand = new Random();
		
		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 280, 280);
		
		g.setColor(new Color((rand.nextInt(256)), rand.nextInt(256), rand.nextInt(256)));
		g.fillRect(120, 120, 110, 110);
			
		g.setColor(new Color((rand.nextInt(256)), rand.nextInt(256), rand.nextInt(256)));
		g.fillRect(250, 120, 110, 110);
		
		g.setColor(new Color((rand.nextInt(256)), rand.nextInt(256), rand.nextInt(256)));
		g.fillRect(250, 250, 110, 110);
		
	}

}
