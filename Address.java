/**
* address class to to store address 
* 
* @author Dilmanpreet Nandu
* @version 2018.18.09
*/
public class Address {
	
	private int number;
	String street;
	String city;
	String province;
	String postalCode;
	
	/**
    contructs the address
  */
  public Address(){
    number = 0;
    street = "";
    city = "";
    province = "";
    postalCode = "";
  }
  
  /**
  sets the house number
  @param number2 new house number
*/
public void setNumber( int number2){
  this.number = number2;
}

/**
  returns the house number
  @return int
*/
public int getNumber(){
  return number;
}

  /**
    sets the street name
    @param street2 new street 
  */
  public void setStreet(String street2){
    this.street = street2;
  }

  /**
    returns the street Name
    @return String
  */
  public String getStreet(){
    return street;
  }



  /**
    sets the city name
    @param city2 new city name
  */
  public void setCity( String city2){
    this.city = city2;
  }

  /**
    returns the city name
    @return String
  */
  public String getCity(){
    return city;
  }

  /**
    sets the province
    @param province2 new province 
  */
  public void setProvince( String province2){
    this.province = province2;
  }

  /**
    returns the province
    @return String
  */
  public String getProvince(){
    return province;
  }

  /**
    sets the new postal code 
    @param postal new postal code 
  */
  public void setPostalCode( String postalCode2){
    this.postalCode = postalCode2;
  }

  /**
    returns the postal code of the Address
    @return String
  */
  public String getPostalCode(){
    return postalCode;
  }

//
///**
//	* change the address of the student
//	 * @param Number 
//	 * @param street 
//	 * @param city 
//	 * @param province 
//	 * @param postalCode
//	*/	
//	
//	public static void changeAddress(int number3, String street3, String city3, String province3, String postalCode3) {
//		// TODO Auto-generated method stub
//		
//		  setNumber(number3);
//	      setStreet(street3);
//	      setCity(city3);
//	      setProvince(province3);
//	      setPostalCode(postalCode3);
//
//		
//		
//		
//	}
	  /**
     toString() method 
  */
  public String toString(){
    return number+", "+street+", "+city+", "+province+", "+postalCode;
  }
	
}
	
	
