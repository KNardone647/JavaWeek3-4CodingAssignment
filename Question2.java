package allWeek4HW;


public class Question2 {

	public static void main(String[] args) {
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//		3.	How do you access the last element of any array?
//		//ANSWER: you use length-1 or in arrayList you can use lastIndexOf
//		4.	How do you access the first element of any array?
//		//ANSWER use arrayName[0] or in arrayList you can use indexOf
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//


//		2.
//		Create an array of String called names that contains the following values: 
//	    “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    	String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//a. Print the result to the console. (this is for the method that I wrote at line 
		//here I am calling the method and printing it out 
		   int avgLength = avgNameLength(names);
		   System.out.println("This is the average number of letters in each word: " + avgLength);
		   System.out.println("_______________________________________");
		   System.out.println();
			     
		 //b.	Use a loop to iterate through the array again and concatenate all the names together,
		//separated by spaces, and print the result to the console.   
		    String result = "";    
			for(int i = 0; i < names.length; i++) {
				result += (names[i] + " "); 
				
			}
			System.out.print("All the names in the array together is: ");
			System.out.print(result);
			System.out.println();
			System.out.println("_______________________________________");
			
	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
    //names array and add the length of each name to the nameLengths array.
			
           int[]namesLengths = new int[names.length];
            for(int i =0; i<namesLengths.length; i++) {
    	    namesLengths[i]= names[i].length();
    	    
            }
      
    //6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
    //Print the result to the console. 
          int sumElementsArray =0; 
          for(int i = 0; i<namesLengths.length; i++) {
    	  sumElementsArray += namesLengths[i];
    	  
            }
          System.out.println();
          System.out.print("The sum of all elements of the array is: ");
          System.out.println(sumElementsArray);
			
			
    //a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
    //I used an enhanced for loop to do this, the method is called at the top of the page and printed to console there
		}
          static int avgNameLength(String[] names) {
	      int sum = 0; 
		  for(String n: names) {
			sum += n.length();
		   }
		  return sum/names.length;
		
	
}


          

}
 