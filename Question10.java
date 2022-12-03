package allWeek4HW;

public class Question10 {

	public static void main(String[] args) {
	// 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	
		
	// creating the array and assigning each index an element of the type double
     double[] myArray = new double[3];
     myArray[0] = 15.55;
     myArray[1] =20.45;
     myArray[2] = 30.92; 
     
     // calling the method below to print the result to console 
     System.out.println("The average of the three numbers is: ");
     System.out.println(averageCalc(myArray));
     
	}

	
	// the method that includes an enhanced loop that adds all of the elements in the array together
	// and returned the average of those elements
	public static double averageCalc(double[] myNumbers) {
		double mySum = 0;
		for(double myNumber: myNumbers){
			mySum += myNumber; 
		}
		return mySum/ myNumbers.length;
	}
}