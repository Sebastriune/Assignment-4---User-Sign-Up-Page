/** Car class is a class to represent car with color, horsePower, engineSize, and make **/
public class CarSecondTry {
	/** These are all instance variables **/
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	private static int count = 0;

	/** Car constructor initializes a car object with name as white, 
	 * horsePower as 250, egineSize as 4.0, and make as Toyota **/
	public CarSecondTry() {
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
	public CarSecondTry(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
		count++;
	}
	
	/** setter methods, mutator methods */
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	/** getter methods, accessor methods **/
	public static int getCount() {
		return count;
	}
	
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
	
	public boolean equals(Car car) {
		return this.color.equals(car.color) && this.horsePower == car.horsePower 
			&& this.engineSize == car.engineSize && this.make.equals(car.make);
	}
	
	public String toString() {
		return "Color " + color + " Horse Power " + horsePower + 
			" Engine Size " + engineSize + " Make " + make;
	}


}
