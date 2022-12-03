package allWeek4HW;

public class Question9 {
	
	public static void main(String[] args) {
//9.Write a method that takes an array of int and returns true if 
//the sum of all the ints in the array is greater than 100.
		
  // creating the array and setting all of the indexes with elements 
       int[] myArray = new int[3];
       myArray[0] = 10;
       myArray[1] = 6;
       myArray[2] = 12;
     
   //conditional if statement that returns true if the value of the sum is greater than 100
     if(sumofArray(myArray) > 100) {
   	 
   	  System.out.println(true);
     }
     else {
   	  System.out.println(false);
     }
     
	}
	// the method that includes enhanced loop that adds all of the elements together
	public static int sumofArray(int[] numbers) {
		int sum = 0;
	
		for(int number: numbers ) {
			sum +=number;
			
		}
		return sum; 
	}

}
