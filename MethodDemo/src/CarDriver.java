
public class CarDriver {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car hisCar = new Car("Black",400,3.5,"Honda");
		Car herCar = new Car("Pink",300,2.5,"Volks");
		
		System.out.println(myCar);
		System.out.println(hisCar);
		System.out.println(herCar);
		
		myCar.setColor("Blue"); myCar.setHorsePower(650); myCar.setEngineSize(6.5); myCar.setMake("Ferrari");
		hisCar.setColor("Blue"); hisCar.setHorsePower(650); hisCar.setEngineSize(6.5); hisCar.setMake("Ferrari");
		herCar.setColor("Blue"); herCar.setHorsePower(650); hisCar.setEngineSize(6.5); herCar.setMake("Ferrari");
		System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());
		System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());
		System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
	}
}
