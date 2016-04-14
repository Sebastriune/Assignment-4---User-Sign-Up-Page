import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CarDriverSecondTry {
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JLabel colorLbl = new JLabel("Enter Color");
		JLabel horsePowerLbl = new JLabel("Enter Horse Power");
		JLabel engineSizeLbl = new JLabel("Enter Engine Size");
		JLabel makeLbl = new JLabel("Enter Make");
		JTextField horsePowerTxt = new JTextField("Type Horse Power");
		JTextField engineSizeTxt = new JTextField("Type Engine Size");
		JTextField colorTxt = new JTextField("Type Color");
		JTextField makeTxt = new JTextField("Type Make");
		JButton button = new JButton("Submit");
		
		panel.add(colorLbl);
		panel.add(colorTxt);
		panel.add(horsePowerLbl);
		panel.add(horsePowerTxt);
		panel.add(engineSizeLbl);
		panel.add(engineSizeTxt);
		panel.add(makeLbl);
		panel.add(makeTxt);
		panel.add(button);
		
		JOptionPane.showMessageDialog(null,panel,"Car Information",JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println("Number of car(s): " + Car.getCount());
		String color = JOptionPane.showInputDialog(null, "Enter Color of the car");
		int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter engine size of the car"));
		double engineSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter engine size of the car"));
		
		String make = JOptionPane.showInputDialog(null, "Enter make of the car");
		Car myCar = new Car(color,horsePower,engineSize,make);
		Car hisCar = new Car("Black",400,3.5,"Honda");
		Car herCar = new Car("Pink",300,2.5,"Volks");
		
		System.out.println(myCar);
		System.out.println(hisCar);
		System.out.println(herCar);
		
		System.out.println("Is myCar the same as hisCar? " + myCar.equals(hisCar));
		System.out.println("Is herCar the same as hisCar? " + herCar.equals(hisCar));
		System.out.println("Is myCar the same as herCar? " + myCar.equals(herCar));
		
		myCar.setColor("Blue"); myCar.setHorsePower(650); myCar.setEngineSize(6.5); myCar.setMake("Ferrari");
		hisCar.setColor("Blue"); hisCar.setHorsePower(650); hisCar.setEngineSize(6.5); hisCar.setMake("Ferrari");
		herCar.setColor("Blue"); herCar.setHorsePower(650); herCar.setEngineSize(6.5); herCar.setMake("Ferrari");
		
		System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());
		System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());
		System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
	}
}
