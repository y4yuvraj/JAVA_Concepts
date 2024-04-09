package ioStream.serializationAndDeserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1379817985901799648L;
	
	int id;
	String name;
	String city;
	transient int ssn;
	
	public Employee(int id, String name, String city, int ssn) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", ssn=" + ssn + "]";
	}
	
	
	
}
