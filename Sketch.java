import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 100);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 155, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
   fill(1, 143, 18);
   //rect(0, 300, 400, 100);
   rect((0), (float) (height * 0.75), (float) (width / 1), (float) (height / 4));

   fill(176, 94, 7);
   //rect(100, 150, 200, 200);
   rect((float) (width / 4), (float) (height * 0.375), (float) (width / 2), (float) (height / 2));

   fill(219, 171, 13);
   //rect(60, 150, 275, 35);
   rect((float) (width * 0.15), (float) (height * 0.375), (float) (width * 0.6875), (float) (height * 0.0875));

   fill(219, 171, 50);
   //rect(125, 250, 50, 100);
   rect((float) (width * 0.3125), (float) (height / 1.6), (float) (width / 8), (float) (height / 4));

   fill(252, 227, 3);
   //ellipse(400, 0, 100, 100);
   ellipse((float) (width / 1), (0), (float) (width / 4), (float) (height / 4));

   fill(0);
   //ellipse(138, 297, 7, 7);
   ellipse((float) (width * 0.345), (float) (height * 0.7425), (float) (width * 0.0175), (float) (height * 0.0175));

   fill(176, 233, 247);
   //rect(220, 240, 50, 50);
   rect((float) (width * 0.55), (float) (height * 0.6), (float) (width / 8), (float) (height / 8));

   fill(0);
   //line(248, 240, 248, 290);  
   line((float) (width * 0.62), (float) (height * 0.6), (float) (width * 0.62), (float) (height * 0.725));

   fill(0);
   //line(220, 264, 270, 264);
   line((float) (width * 0.55), (float) (height * 0.66), (float) (width * 0.675), (float) (height * 0.66));

   }
  
  // define other methods down here.
}