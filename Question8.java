package allWeek4HW;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
	
	    
	//	8.	Write a method that takes two Strings, firstName and lastName,
    //and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		
     // prompting the user to input a first and last name    
		System.out.println("Please input a first name and hit enter:");
    	System.out.println("Please input a last name and hit enter:");
	
	// making sure the system can take user input from keyboard
	// calling on the method makeFullName and printing it out console
		Scanner scnr = new Scanner(System.in);
		String firstName;
		String lastName;
		firstName = scnr.nextLine(); 
		lastName = scnr.nextLine(); 
		String fullName = makeFullName(firstName, lastName);
		System.out.println("Your fullname is: " +fullName);
	}

   // where I have created method that adds the first and last name together
	   public static String makeFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName; 
	}
}
