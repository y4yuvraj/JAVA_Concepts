package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import comparableAndComparator.ComparatorEmployee;

public class Employee implements Comparable<Employee> {

	public int id;
	public String FirstName;
	public String LastName;

	// compareTo method from comparable interface for natural ordering
	@Override
	public int compareTo(Employee o) {
		// our natural ordering will be based on id
		if (this.id < o.id) {
			return -1;
		} else if (this.id > o.id) {
			return 1;
		}
		// if same we will do natural ordering based on FirstName
		return this.FirstName.compareTo(o.FirstName);
	}
	
	@Override
	public String toString()
	{
		return "id="+id+" first name="+FirstName +" last name="+LastName;
		
	}

	// constructor for intitalising Employee object
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}
	
	public static void main(String[] args) {
		List<Employee> employeeList= new ArrayList<>();
		employeeList.add(new Employee(109, "yuv1" , "singh1"));
		employeeList.add(new Employee(101, "yuv2" , "singh2"));
		employeeList.add(new Employee(103, "yuv3" , "singh3"));
		employeeList.add(new Employee(102, "yuv4" , "singh4"));
		employeeList.add(new Employee(101, "abc" , "singh5"));
		
		System.out.println("Employe List: "+employeeList); //unsorted
	
		Collections.sort(employeeList); 
		
		System.out.println("Employe List: "+employeeList); //sorted
		
		//unnatural ordering using Comporartor
		
		Collections.sort(employeeList,new ComparatorEmployee());
		System.out.println("Employe List: "+employeeList); //sorted based on FirstName
		
	}

}

/*
Employe List: [id=109 first name=yuv1 last name=singh1, id=101 first name=yuv2 last name=singh2, id=103 first name=yuv3 last name=singh3, id=102 first name=yuv4 last name=singh4, id=101 first name=abc last name=singh5]
Employe List: [id=101 first name=abc last name=singh5, id=101 first name=yuv2 last name=singh2, id=102 first name=yuv4 last name=singh4, id=103 first name=yuv3 last name=singh3, id=109 first name=yuv1 last name=singh1]
Employe List: [id=101 first name=abc last name=singh5, id=109 first name=yuv1 last name=singh1, id=101 first name=yuv2 last name=singh2, id=103 first name=yuv3 last name=singh3, id=102 first name=yuv4 last name=singh4]
*/
