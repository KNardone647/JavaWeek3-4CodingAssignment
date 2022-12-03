package allWeek4HW;

public class Question11 {

	public static void main(String[] args) {
	// 11.	Write a method that takes two arrays of double and
	//returns true if the average of the elements in the first array 
	//is greater than the average of the elements in the second array.
		
		
        // creating the first array and assigning elements to each index
		double[] firstStudentGrades =  new double[5];
		firstStudentGrades[0] = 99.5;
    	firstStudentGrades[1] = 70.5;	
		firstStudentGrades[2] = 90.5;
		firstStudentGrades[3] = 82.75;
		firstStudentGrades[4] = 99.5;
		
		//creating second array and assigning elements to each index
		double[] secondStudentGrades =  new double[5];
		secondStudentGrades[0] = 82.2;
		secondStudentGrades[1] = 90.5;
		secondStudentGrades[2] = 99.5;
		secondStudentGrades[3] = 50.3;
		secondStudentGrades[4] = 97.5;
		
	    //conditional-if statement that returns true if the first array average is greater than the second 
		//this calls the method created below
		 if(calcAverage(firstStudentGrades) > calcAverage(secondStudentGrades) ) {
		    	 
	    	  System.out.println(true);
	      }
	      else {
	    	  System.out.println(false);
	      }
		
	}

	// method that finds the average of the elements in the arrays 
	     public static double calcAverage(double[] nums) {
	    	 
		   double sum =0;
		   for(double num :nums) {
			sum += num;
		   }
	      return sum/ nums.length; 

	
  }
}
