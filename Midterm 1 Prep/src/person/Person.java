package person;

public class Person {
	
	private String firstName;
	private String lastName;
	private Address address;
	
	Person (String fName, String lName, Address a){
		firstName = fName;
		lastName = lName;
		address = a;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param a to set the address
	 */
	public void setAddress(Address a) {
		a = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(firstName + " " + lastName + " " + address);
	}
	
	
	
}
