
//File: Student
//Name: Dilmanpreet Nandu
//Student ID: 100271865

/**
* Student file to store student data and quiz scores
* 
* @author Dilmanpreet Nandu
* @version 2018.18.09
*/
public class Student
{
	
	private String name;  // The name of the student
	private long studentID; // The student id of the student
	private Address address; // The address of the student
	private double TotalQuizScore,TotalQuiz;
	
	
	/**
	* Create a student with a student ID
	*/

	public Student(int id) {
		// TODO Auto-generated constructor stub
		
		this.studentID=id; // The student id of the student
		 TotalQuizScore=0;
		 TotalQuiz=0;
	}
	/**
	* Return the Name of the student
	*/
	public String getName()
	{
		return name;
	}
	/**
	* Return the Name of the student
	*/
	public long getStudentID()
	{
		return studentID;
	}
	
	/**
	* Return the address of the student
	*/
	public String getAddress()
	
	{
		return address.toString();
	}
	
	
	

	/**
	*  Set the name of the student
	*/
	public void setName(String name)
	{
		this.name=name;
	}

	/**
	* change the address of the student
	 * @param Number 
	 * @param street 
	 * @param city 
	 * @param province 
	 * @param postalCode
	*/	
	
	public void changeAddress(int number, String street, String city, String province, String postalCode)
	{
//			Address.changeAddress(Number,street,city,province,postalCode);
		
		  address.setNumber(number);
		  address.setStreet(street);
		  address.setCity(city);
		  address.setProvince(province);
		  address.setPostalCode(postalCode);

	}


	/**
	* Receive a average score of the quiz
	*/
	public double getAverageQuizScore()
	{
		return this.TotalQuizScore/(this.TotalQuiz*10); //MULTIPLY BY 10 BECAUSE ALL QUIZ ARE OUT OF 10
	}

	/**
	* add a new quiz score
	*/
	public void addNewQuizScore(double quiz)
	{
		this.TotalQuizScore+=quiz;
		this.TotalQuiz++;
		
	}
 
 
}