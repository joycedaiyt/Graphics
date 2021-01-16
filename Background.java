// Background.java

import java.awt.*;
import java.applet.*;

class Background
{	
    public static void drawSky(Graphics g)
    { 	
	    g.setColor(new Color(128,128,255));
       g.fillRect(0,0,650,450); 
	 }
    public static void drawGrass(Graphics g)
    { 	
	    g.setColor(new Color(0,128,0));
       g.fillRect(0,450,650,200); 	
	 }
} 
