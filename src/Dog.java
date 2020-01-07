/**
 * this class models 
 * @author omarsanyang
 *
 */


public class Dog {

	private String name;
	private int age;

	public Dog() {
		
		name = "null";
		age = 0;
	
	
	}//end empty-argument constructor
	
	/**
	 * this is the preferred constructor.
	 * @param name
	 * @param age
	 */
	
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}//end preferred constructor
	
	/**
	 * this method returns a string that represents the dog's bark.
	 * @return
	 */

	public String bark() {
		return "Bark, bark, bark !!";
	}//end bark
	
	//Getter/Setters/ToString 

	public String getName() {
		return name;
	}//end getName 
	
	
	public void setName(String name) {
		this.name = name;
	}// end setName 
	
	
	public int getAge() {
		return age;
	}//end getAge
	
	
	public void setAge(int age) {
		this.age = age;
	}// end setAge


	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}//end toString 
	
	
	
	
	
	
	
	
}//end class 
