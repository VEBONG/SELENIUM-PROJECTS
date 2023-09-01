package testingCalculations;

import java.util.Scanner;

public class CalculateAreaOfCircle {

	public static void main(String[] args) {
	
		// instantiate scanner object
		Scanner scan = new Scanner(System.in);
	// A java program to compute area of a circle
		// declare pie as double and initialise it
		double pie = 3.142;
		// declare and initialize radius
		// prompt use to enter value for radius
		System.out.println("Enter the radius  in meters (m)");
		double radius = scan.nextDouble();
		scan.close();
		// compute the area
		double area = pie * radius * radius;
		// print the result
		System.out.println("Area of the circle with radius " + radius + "m is " + area + " meters square");
		

	}

}
