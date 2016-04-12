/** Car class is a class to represent car with color, horsePower, engineSize, and make **/
public class Car {
	
	/** These are all instance variables **/
	String color;
	int horsePower;
	double engineSize;
	String make;
	
	/** Car constructor initializes a car object 
	 * with name as white, horsePower as 250,  
	 * egineSize as 4.0, and make as Toyota **/
	public Car() {
		color = "white";
		horsePower = 250;
		engineSize = 4.0;
		make = "Toyota";
	}
	
	/** Car constructor initializes values of its attributes
	 * 	@param color car color	 
	 *  @param horsePower car horsePower
	 *  @param engineSize car engineSize
	 *  @param make car make **/
	public Car (String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
	}
	
	/** setter methods, mutator methods */
	public void setColor (String color) {
		this.color = color;
	}
	
	public void setHorsePower (int horsePower) {
		this.horsePower = horsePower;
	}
	
	public void setEngineSize (double engineSize) {
		this.engineSize = engineSize;
	}
	
	public void setMake (String make) {
		this.make = make;
	}
	
	/** getter methods, accessor methods **/
	public String getColor() {
		return color;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public double getEngineSize() {
		return engineSize;
	}

	public String getMake() {
		return make;
	}
	
	public String toString() {
		return "Color " + this.color + " Horse Power " + this.horsePower 
			+ " Engine Size " + this.engineSize + " Make " + this.make;
	}
}
