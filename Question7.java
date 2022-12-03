package allWeek4HW;

import java.util.Scanner;

public class Question7 {
	
//	7.	Write a method that takes a String, word, and an int, n, 
//	as arguments and returns the word concatenated to itself n number of times. 
//	(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	


//method where we are concatenating the word to itself
  static String sayHello(String word, int n) {
	
    String combineString = "";
    for(int i = 0; i < n; i++) {
	   combineString += word;
	   
   }
    return combineString;
}
	
  
// main where are prompting user for input and then calling the method 
	public static void main(String[] args) {
		
		System.out.println("Input the word you want to repeat and hit enter");
		System.out.println("Input the amount of times you want to repeat the word and hit enter");
		
		Scanner scnr = new Scanner(System.in);
		int n;
		String word;
		word = scnr.nextLine(); 
		n = scnr.nextInt();
		
		System.out.println(sayHello(word, n));

		
		
	}

}
