/*Sedak Puri
 *Programming Assignment
 *Thursday October, 26th
 */
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;
import java.awt.Color;

public class TurtleDriver {
	public static final int canvasSize = 500;
	public static void main(String[] args) {
		
		//Initial Variable Declarations
		String input;
		int steps;
		int angle;
		String color;
		
		//Setup + Class Import
		StdDraw.setCanvasSize(canvasSize ,canvasSize);
		StdDraw.setXscale(0, canvasSize);
		StdDraw.setYscale(0, canvasSize);
		Turtle turtle = new Turtle(canvasSize);
		Scanner keyboard = new Scanner(System.in);
		
		//User input
		System.out.println("Welcome to the Turtle Drawing Program!");
		
		//Initial Point
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.point(canvasSize/2 , canvasSize/2);
		
		//Loops
		do {
			System.out.println("Enter a command (followed by a degree measure for a turn or a stepsize for forward): ");
			input = keyboard.next();
			
			//If User Input = Forward
			if (input.equalsIgnoreCase("forward")) {
				steps = keyboard.nextInt();
				turtle.forward(steps);
			
			//If User Input = Left
			} else if (input.equalsIgnoreCase("left")) {
				angle = keyboard.nextInt();
				turtle.left(angle);
				
			//If User Input = Right
			} else if (input.equalsIgnoreCase("right")) {
				angle = keyboard.nextInt();
				turtle.right(angle);
				
			//If User Input = penup
			} else if (input.equalsIgnoreCase("penup")) {
				turtle.penUp();
				
			//If User Input = pendown
			} else if (input.equalsIgnoreCase("pendown")) {
				turtle.penDown();
				
			//If User Input = pencolor
			} else if (input.equalsIgnoreCase("pencolor")) {
				color = keyboard.next();
				if (color.equalsIgnoreCase("black")) {
					turtle.setPenColor(Color.black);
				} else if (color.equalsIgnoreCase("blue")) {
					turtle.setPenColor(Color.blue);
				} else if (color.equalsIgnoreCase("cyan")) {
					turtle.setPenColor(Color.cyan);
				} else if (color.equalsIgnoreCase("grey")) {
					turtle.setPenColor(Color.gray);
				} else if (color.equalsIgnoreCase("green")) {
					turtle.setPenColor(Color.green);
				} else if (color.equalsIgnoreCase("magenta")) {
					turtle.setPenColor(Color.magenta);
				} else if (color.equalsIgnoreCase("orange")) {
					turtle.setPenColor(Color.orange);
				} else if (color.equalsIgnoreCase("pink")) {
					turtle.setPenColor(Color.pink);
				} else if (color.equalsIgnoreCase("red")) {
					turtle.setPenColor(Color.red);
				} else if (color.equalsIgnoreCase("white")) {
					turtle.setPenColor(Color.white);
				} else if (color.equalsIgnoreCase("yellow")) {
					turtle.setPenColor(Color.yellow);
				} else if (color.equalsIgnoreCase("light grey")) {
					turtle.setPenColor(Color.lightGray);
				} 
				
			//If User Input = reset
			} else if (input.equalsIgnoreCase("reset")) {
				turtle.resetPenColor();
				
			//If User Input = quit
			} else if (input.equalsIgnoreCase("quit")) {
				System.exit(0);
				
			//If User Inputs anything else
			} else {
				System.out.println("Invalid Statement!");
			}
		} while (!input.equals("quit"));
	
		keyboard.close();
	}

}
 