/*Sedak Puri
 *Programming Assignment
 *Thursday October, 26th
 */
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Turtle {
	private double xPos;
	private double yPos;
	private double direction;
	private boolean penDown;
	private boolean coloredPen;
	private Color penColor;
	private int stepSize;
	
	//Empty Constructor
	public Turtle() {
		
	}
	
	//Constructor that takes in value
	public Turtle(int x) {
		xPos = x/2;
		yPos = x/2;
		direction = 0;
		stepSize = x/20;
		coloredPen = false;
		penDown = false;
		penColor = Color.black;
	}
	
	//Forward Method
	public void forward(int steps) {
		for (int i = 0; i < steps; i++) {
		if (penDown ==  true) {
			//To check if pen is colored
			StdDraw.setPenColor(Color.BLACK);
			if (coloredPen = true) {
				StdDraw.setPenColor(penColor);
			}
			
			//To store old x and y values
			double oldX = xPos;
			double oldY = yPos;
			
			//To determine new x and y values
			xPos += stepSize * Math.cos(Math.toRadians(direction));
			yPos += stepSize * Math.sin(Math.toRadians(direction));
		
			StdDraw.line(oldX, oldY, xPos, yPos);
			StdDraw.point(xPos, yPos);
		
		} else if (penDown == false) {
			StdDraw.setPenColor(Color.BLACK);
			//To check if pen is colored
			if (coloredPen = true) {
				StdDraw.setPenColor(penColor);
			}
			
			xPos += stepSize * Math.cos(Math.toRadians(direction));
			yPos += stepSize * Math.sin(Math.toRadians(direction));
		
			StdDraw.point(xPos, yPos);	
		}
	}
}
	//To turn right
	public void right(double angle) {
		direction -= angle;
	}
	
	//To turn left
	public void left(double angle) {
		direction += angle;
	}
	
	//penUp Method
	public void penUp() {
		penDown = false;
	}
	
	//penDown Method
	public void penDown() {
		penDown = true;
	}
	
	//setPenColor Method
	public void setPenColor(Color x) {
		coloredPen = true;
		penColor = x;
	}
	
	//Reset PenColor Method
	public void resetPenColor() {
		coloredPen = false;
	}
}
