/**
* Assignment Midterm 2
* Program: GuiExercise
* Programmer: Brooke Horrocks
* Date: Jul 18, 2018
*/
package midterm2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiExercise extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Icon NewYork = new ImageIcon(getClass().getResource("NewYork.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExercise frame = new GuiExercise();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiExercise() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel title = new JLabel("New York");
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(title, BorderLayout.NORTH);
		
		JLabel nyPicture = new JLabel("");
		nyPicture.setBackground(new Color(173, 216, 230));
		contentPane.add(nyPicture, BorderLayout.CENTER);
		nyPicture.setOpaque(true);
		nyPicture.setVisible(true);
		nyPicture.setIcon(NewYork);
		
		JButton button = new JButton("Show New York At Night");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(button.getText().equals("Show New York At Night")) {
				nyPicture.setBackground(new Color(72, 88, 104));
				button.setText("Show New York At Day");
				}
				else {
					nyPicture.setBackground(new Color(173, 216, 230));
					button.setText("Show New York At Night");
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.GRAY);
		contentPane.add(button, BorderLayout.SOUTH);
		
	}

}
