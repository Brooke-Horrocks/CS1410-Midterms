/**************************************
 * Author: Brooke Horrocks
 * CSIS-1410 midterm1
 * 
 **************************************/

package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	private static final long serialVersionUID = 6091129515936517403L;

	public DrawPanel() {

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Random r = new Random();
		Color[] c = {Color.RED, Color.BLACK, Color.BLUE, Color.WHITE, Color.ORANGE, Color.YELLOW};
		
		int y = 0;
		int x = 100;
		int width = 200;
		int height = 200;
		int loop = 5;
		
		for(int i = 0; i < loop; i++) {
			g.setColor(c[r.nextInt(5)]);
			g.fillRect(x, y, width, height);
			x += 20;
			width -= 40;
			height -= 20;
			
		}
	}
}
