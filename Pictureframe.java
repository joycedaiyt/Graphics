// Joyce Dai
// 10/22/2019
// APCS, Mr. Robinson
// Drawing a background, a cat, and a flower using multiple classes and methods
// and each class has its own file. 

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Pictureframe extends Applet
{
	public void init()
   {
       setSize(650, 650); 
   } 
	public void paint(Graphics g) 	
	{	
      Background.drawSky(g);
      Background.drawGrass(g);
      Cat.drawBody(g);
      Cat.drawEyes(g);
      Cat.drawNose(g);
      Cat.drawMouth(g);
      Cat.drawHands(g);
      Cat.drawFeet(g);
      Cat.drawTummy(g);
      Cat.drawTail(g);
      Cat.drawWiskers(g);
      Flower.drawPole(g);
      Flower.drawPetals(g);
      Flower.drawCenter(g);
    }
}  
