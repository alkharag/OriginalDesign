int xPosition = 150;
	
	
void setup()
{
	size(512, 512);
}
void draw()
{
	
	ball();

}
void ball()
{
	background(50,50,90);

	rect(0, 300, 512, 300);
	
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