package person;

public class PersonApp {
	public static void main(String[] args) {
		Address address1 = new Address("Main Street 123", 87654, "Hometown", "UT");
		Person person1 = new Person("Tara", "Rice", address1);
		
		System.out.println(person1);
		
		address1.setCity("Moab");
		address1.setZip(84532);
		
		person1.setAddress(address1);
		
		System.out.println(person1);
		
	}
}
