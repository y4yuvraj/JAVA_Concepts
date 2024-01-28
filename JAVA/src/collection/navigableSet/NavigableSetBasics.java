package collection.navigableSet;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetBasics {

	public static void main(String[] args) {
		NavigableSet<Integer> nSet= new TreeSet();
		nSet.add(1);
		nSet.add(3);
		nSet.add(3);
		nSet.add(2);
		nSet.add(8);
		nSet.add(6);
		
		System.out.println(nSet); //[1, 2, 3, 6, 8]
		// we will see navigable set functions in action
		System.out.println(nSet.floor(3)); //3
		System.out.println(nSet.ceiling(3)); //3
		System.out.println(nSet.lower(3)); //2
		System.out.println(nSet.higher(3)); //6
		System.out.println(nSet.descendingSet()); //descending order
		System.out.println(nSet.pollFirst()); //1
		System.out.println(nSet.pollLast()); //8
		
		

	}
	
}
