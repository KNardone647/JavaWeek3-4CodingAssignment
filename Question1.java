package allWeek4HW;
import java.util.ArrayList;



public class Question1 {

	public static void main(String[] args) {
// talked to Lisa about this one, I thought that i.e. do not use ages[7] meant I can't use ages[0] also, I later realized
// I could and it could be done with regular array, but she said it would be okay just let graders know why
// I used ArraysList because the answer is still correct 
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.


//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		
		// printing out index and element associated with it 
		System.out.println("Original Array");
		System.out.println("_________________________________");
		for (int i = 0; i < ages.size(); i++) {
			System.out.println("index " + i + "---" + ages.get(i));
			}
		System.out.println();
		
		
//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code).
		//Print the result to the console. 
		
		
		int result = ages.lastIndexOf(ages) -(ages.indexOf(ages));
		System.out.print("The last element minus the first element equals: ");
		System.out.println(ages.get(result));
		System.out.println();
	
		
		
//b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
		//(works for arrays of different lengths).
		ages.add(31);
		System.out.println("New Array");
		System.out.println("_________________________________");
		for(int i = 0; i < ages.size(); i++) {
			System.out.println("index " + i + "---" + ages.get(i));
		}
		System.out.println("_________________________________");
		
		
//c.	Use a loop to iterate through the array and calculate the average age. 
	    //Print the result to the console.
		
		
    	int total = 0;
		int averageAge;
		
		for(int i = 0; i <ages.size(); i++) {
			total += ages.get(i);
		}
          averageAge = total/ages.size();
          System.out.println();
          System.out.print("The average age is: ");
          System.out.println(averageAge);

          
     
       }


}

