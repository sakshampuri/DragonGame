package GameState;

import java.awt.Color;
import java.awt.Graphics2D;

import Main.GamePanel;
import TileMap.Background;

public class HelpState extends GameState{
	
	private Background bg;
	
	public HelpState(){
		
		try{
			bg = new Background("/Backgrounds/grassbg1.gif", 2);
			bg.setVector(0.4, 0);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		bg.update();
	}

	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		g.drawString("NULL,", 120, 100);
		g.drawString("NULL", 120, 120);
	}

	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}

}
