package collectionsAndArraysClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(9);
		System.out.println("before sorting: "+list);
		Collections.sort(list);
		System.out.println("After sorting: "+list);
		int index= Collections.binarySearch(list, 2);
		System.out.println("2 located at index: "+index);
		Collections.reverse(list);
		System.out.println("After reversing: "+list);

	}

}
