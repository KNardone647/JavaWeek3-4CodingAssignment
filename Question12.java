package allWeek4HW;


import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
	 // 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
	 //and a double moneyInPocket, and 
	//returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		// prompting the user to input data and preparing the computer to process this input
		System.out.println("Please input whether it is hot outside, true or false. Hit enter:");
    	System.out.println("Please input the amount of money in your pocket. Hit enter:");
		Scanner scnr = new Scanner(System.in);
		boolean isItHot = scnr.nextBoolean();
		double  myMoney = scnr.nextDouble();
		
		//calling on the method created below
		System.out.println(willBuyDrink(isItHot,myMoney));
		
	}
	//creating a boolean method that returns true if the user has more than 10.50 in their pocket
	// and it is hot outside 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if((moneyInPocket>10.50) && (isHotOutside==true)) {
			return true;
		}
		return false; 
	}

}
