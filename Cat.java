//Cat.java

import java.awt.*;
import java.applet.*;

class Cat
{
    public static void drawBody(Graphics g)
    { 
       Color LightYellow = new Color(225,225,204);
       Polygon Body = new Polygon();
       int [] x1 = {100, 100, 325, 325, 275, 150};
       int [] y1 = {275, 625, 625, 275, 325, 325};
       g.setColor(LightYellow);
       g.fillPolygon(x1, y1, 6);   
	 }
    public static void drawEyes(Graphics g)
    { 	
       g.setColor(Color.BLACK);
       g.drawOval(100, 350, 100, 100);
       g.drawOval(225, 350, 100, 100);
       g.fillOval(125, 375, 50, 50);
       g.fillOval(250, 375, 50, 50);
	 }		
    public static void drawNose(Graphics g)
    { 	
       Color pink = new Color(255,102,102);	
       int [] x2 = {175, 250, 213};
       int [] y2 = {450, 450, 475};
       g.setColor(pink);
       g.fillPolygon(x2, y2, 3);       
	 }	
    public static void drawMouth(Graphics g)
    { 
       g.setColor(Color.BLACK);	
       g.drawArc(165,450,100,50,180,180);
	    g.drawLine(213,475,213,500);
	 }	
    public static void drawHands(Graphics g)
    { 	
	    g.drawLine(100,550,125,550);
       g.drawLine(125,550,125,500);
       g.drawLine(325,550,300,550);
       g.drawLine(300,550,300,500);
	 }	
    public static void drawFeet(Graphics g)
    { 	
        Color Lightbrown = new Color(153,102,0);
        g.setColor(Lightbrown);
	     g.fillArc(125,575,75,100,0,180);
        g.fillArc(225,575,75,100,0,180);
	 }	
    public static void drawTummy(Graphics g)
    { 	
	     Color Lightpink = new Color(236,153,175);
        g.setColor(Lightpink);
        g.fillArc(150,526,125,100,0,180);
	 }	
    public static void drawTail(Graphics g)
    {
       Color LightYellow = new Color(225,225,204);
       Polygon Tail = new Polygon();
       int [] x2 = {325, 375, 400, 325};
       int [] y2 = {570, 490, 520, 600};
       g.setColor(LightYellow);
       g.fillPolygon(x2, y2, 4);  
    }
    public static void drawWiskers(Graphics g)
    {
       g.setColor(Color.BLACK);
       g.drawLine(240,460,375,450);
       g.drawLine(240,470,375,480);
       g.drawLine(185,460,50,450);
       g.drawLine(185,470,50,480);
     }
}
