//File: StudentTester
//Name: Dilmanpreet Nandu
//Student ID: 100271865
/**
* Student file tester to test student class
* 
* @author Dilmanpreet Nandu
* @version 2018.18.09
*/
public class StudentTester
{
	public static void main(String[] args){
		
		// new student
		Student test =  new Student(110000027);
		test.setName("Dilman");
		test.addNewQuizScore(4);
		test.addNewQuizScore(3);
		test.addNewQuizScore(8);
		test.addNewQuizScore(4);
		// calcuating the average
	   
	   //change address 
	   test.changeAddress(655, "E 51st ave", "vancouver", "bc","v5x1x8"); 
	   
	   System.out.println("Name = " + test.getName());
	   System.out.println("StudentID = " + test.getStudentID());
	   System.out.println("Address= " + test.getAddress());
	   System.out.println("Average = " + test.getAverageQuizScore());
	    
	   
	   
	 
	
     
	} 
}	







