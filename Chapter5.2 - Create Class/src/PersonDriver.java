
public class PersonDriver {
	/** main method*/
	public static void main (String[] args) {
		Person p1 = new Person();
		System.out.println (p1);
		
		Person p2 = new Person ("Sebastian Koo", 29);
		System.out.println (p2);
		
		// Test if two persons are equal
		if (p1.equals(p2)) {
			System.out.println (p1.getName() + " equals p3 " + p2.getName());
		} else {
			System.out.println (p1.getName() + " is NOT equal to " + p2.getName());
		}
		
		// Test if two persons have the same name
		if (p1.getName() == p2.getName()) {
			System.out.println ("The two persons have the same name: " + p1.getName());
		} else {
			System.out.println ("The two persons have different names: " + p1.getName() + " and " + p2.getName());
		}
		
		// Compare two person's ages
		if (p1.getAge() < p2.getAge()) {
			System.out.println (p1.getName() + " is younger than " + p2.getName());
		} else if (p1.getAge() == p2.getAge()) {
			System.out.println (p1.getName() + " and " + p2.getName() + " have the same age");
		} else {
			System.out.println (p1.getName() + " is older than " + p2.getName());
		}
	}
}
