//Flower.java

import java.awt.*;
import java.applet.*;

class Flower
{	
    public static void drawPole(Graphics g)
    { 
       g.setColor(Color.GREEN);	
	    g.fillRect(450,400,25,100);
	 }
    public static void drawPetals(Graphics g)
    { 	
	    g.setColor(Color.RED);
       g.fillOval(470,380,40,40);
       g.fillOval(465,350,40,40);
       g.fillOval(445,337,40,40);
       g.fillOval(420,350,40,40);
       g.fillOval(420,380,40,40);
       g.fillOval(445,390,40,40);
	 }
    public static void drawCenter(Graphics g)
    { 	
	    g.setColor(Color.YELLOW);
       g.fillOval(447,370,30,30);
	 }
} 
