package Main;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args){
		
		JFrame frame = new JFrame("Dragon Game");
		frame.setResizable(false);
		frame.setContentPane(new GamePanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
