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

public class SierpinskiTriangle extends PApplet {

//drawing parameters
int detail = 30; //makes triangle more 'detailed' by recursive func
int sizeSier = detail*10;


public void setup()
{
	size((sizeSier/2)*(5/4), (sizeSier/2) * (5/4)); //trying to fit the triangle
}

public void draw()
{
	sierpinski(sizeSier/8, sizeSier - sizeSier/8, sizeSier);
}

public void mouseMoved()//optional
{
	double prevMouseX = 0;

	//sizeSier++;
	if (detail > 0)
	{
		detail--;
	}
}

public void sierpinski(int x, int y, int len) 
{
	if (len > detail)
	{
		sierpinski(x, y, len/2);
		sierpinski(x+len/2, y, len/2);
		sierpinski(x+len/4, y-len/2, len/2);
	}
	else 
	{
		strokeWeight(1);
		triangle(x, y, x+len/2, y-len, x+len, y);
	}
}

/*
20 A
21 
*/
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
