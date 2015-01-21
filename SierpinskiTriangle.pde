public void setup()
{
	size (100, 100);
}

public void draw()
{
	sierpinski(0, 50, 21);
}

public void mouseDragged()//optional
{

}

public void sierpinski(int x, int y, int len) 
{
	//triangle(x, y, x+len/4, y+len/2, x+len/2, y);

	if (len > 20)
	{
		sierpinski(x, y, len/2);
		sierpinski(x+len/2, y, len/2);
		sierpinski(x+len/4, y+len/2, len/2);
	}
	else 
	{
		triangle (x, y, x+len/2, y+len, x+len, y);
	}
}

/*
20 A
21 
*/