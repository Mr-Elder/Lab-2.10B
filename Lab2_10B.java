/**
 * @(#)Lab2_10B.java
 *
 *
 * @author 
 * @version 1.00 2013/11/18
 */

import java.util.*;
import java.awt.*;
import java.applet.Applet;

public class Lab2_10B extends Applet{

	public void paint(Graphics page){
		Random rand = new Random();

		final int MAX_SIZE = 300;
      	final int PAGE_WIDTH = 600;
      	final int PAGE_HEIGHT = 400;
      	
      	int x, y;
      	int width, height;
      	
      	page.setColor(Color.blue);
      	x=rand.nextInt(600);
      	y=rand.nextInt(400);
      	width=rand.nextInt(650-x) + 50;
      	height=rand.nextInt(450-y) + 50;
        page.fillRect(x,y,width,height);
        
        page.setColor(Color.white);
      	x=rand.nextInt(600);
      	y=rand.nextInt(400);
      	width=rand.nextInt(650-x) + 50;
      	height=rand.nextInt(450-y) + 50;
        page.fillRect(x,y,width,height);
      	
      	page.setColor(Color.magenta);
      	x=rand.nextInt(600);
      	y=rand.nextInt(400);
      	width=rand.nextInt(650-x) + 50;
      	height=rand.nextInt(450-y) + 50;
        page.fillOval(x,y,width,height);
        setBackground(Color.yellow); 
        page.setColor(Color.white);
      		
      	
	}
	}
    