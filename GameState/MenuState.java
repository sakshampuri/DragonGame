package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import TileMap.Background;

public class MenuState extends GameState {

	private Background bg;
	
	private int currentChoice = 0;
	private String[] options = {"START", "HELP", "QUIT"};
	private Color titleColor;
	private Font titleFont;
	
	private Font font;
	
	public MenuState(GameStateManager gsm){
		
		this.gsm = gsm;
		
		try{
			bg = new Background("/Backgrounds/menubg.gif", 1);
			bg.setVector(-0.6, 0);
			
			titleColor = Color.BLACK;
			titleFont = new Font("Century Gothic", Font.BOLD, 28);
			
			font = new Font("Arial", Font.PLAIN, 12);
			
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
		
		//draw bg
		bg.draw(g);
		
		//draw title
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("Dragon Tale", 80, 70);
		
		//options
		g.setFont(font);
		for(int i = 0; i < options.length; i++){
			if(i == currentChoice)
				g.setColor(Color.RED);
			 else
				g.setColor(Color.BLACK);
			g.drawString(options[i], 145, 140 + i * 15);
		}
		
	}

	public void select(){
		switch(currentChoice){
     		case 0: gsm.setState(GameStateManager.LEVEL1STATE);
     			break;
    		case 1: gsm.setState(GameStateManager.HELPSTATE);
    			break;
	    	case 2: System.exit(0);
	    	    break;
		}
	}
	
	@Override
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER){
			select();
		}
		if(k == KeyEvent.VK_UP){
			currentChoice--;
		}
		if(k == KeyEvent.VK_DOWN){
			currentChoice++;
		}
		if(currentChoice > 2) currentChoice = 0;
		else if(currentChoice < 0) currentChoice = 2;
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}

	
	
}
