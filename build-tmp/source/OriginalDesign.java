import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int xPosition = 150;
	
	
public void setup()
{
	size(512, 512);
}
public void draw()
{
	
	ball();

}
public void ball()
{
	background(50,50,90);

	rect(0, 300, 500, 512);
	
	//body
	arc(xPosition-25, 300, 200, 75, PI, 2*PI);

	//Wheels
	fill(0);
	strokeWeight(3);
	stroke(255);
	ellipse(xPosition, 300,30,30);
	ellipse(xPosition -100 , 300,30,30);

	xPosition+=10;
	

	if (xPosition > 630){
		xPosition = -170;
	}
	
	redraw();
	

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
