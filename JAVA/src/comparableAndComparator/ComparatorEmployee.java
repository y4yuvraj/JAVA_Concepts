package comparableAndComparator;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// we want custom sorting based on the length of first name
		if(o1.FirstName.length()<o2.FirstName.length()) {
			return -1;
		}
		else if(o1.FirstName.length()>o2.FirstName.length()) {
			return 1;
		}
		return o1.FirstName.compareTo(o2.FirstName);
	}

}
