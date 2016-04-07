/**
 * Person class is a class to represent person with name and age
 */
public class Person {
	private String name; 
	private int age;
	
	/**
	 Person Constructor initializes a person object for John Doe (25 years old)
	 with no parameters
	 */
	public Person() {
		name = "John Doe";
		age = 25;
	}
	
	//---------------------------------------------------------
	/**
	 Person Constructor initializes a person object 
	 with parameters: name and age values
	 @param name person name
	 @param age person age
	 */
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//---------------------------------------------------------
	/**getter methods, accessor methods*/
	public String getName() {
		return name;
	}
	
	//---------------------------------------------------------
	/** setter methods, mutator methods*/
	public void setName(String name) {
		this.name = name;
	}

	//---------------------------------------------------------
	/**getter methods, accessor methods*/
	public int getAge() {
		return age;
	}
	
	//---------------------------------------------------------
	/** setter methods, mutator methods*/
	public void setAge(int age) {
		this.age = age;
	}
	
	//---------------------------------------------------------
	@Override
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age;
	}
	
	//---------------------------------------------------------
	public boolean equals (Person p) {
	  return this.name == p.name && this.age == p.age;
	}
}
