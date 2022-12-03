package allWeek4HW;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// 13.	Create a method of your own that solves a problem. 
		//In comments, write what the method does and why you created it.
		
		//prompts the user to input data 
    	System.out.println("Enter the base of the triangle");
		System.out.println("Enter the height of the triangle");
		
		// allows the computer to take the input from keyboard in the double type
		Scanner in = new Scanner(System.in);
	    double base = in.nextDouble();
		double height = in.nextDouble();
		
		//calls on the method created below and prints it out to the console
		double area = triangleArea(base, height);
		System.out.println("The area of a triangle is: " + area);

	}
	   //create a method of the double type that returns the area of a triangle
	    static double triangleArea(double base, double height) {
		
		return ((base*height)/ 2);
 
	}

}

