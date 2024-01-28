package collectionsAndArraysClass;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

	public static void main(String[] args) {
		String [] arr= {"V","A","Z","P"};
		Arrays.sort(arr);
		System.out.println("Z is found at index "+Arrays.binarySearch(arr, "Z"));
		System.out.println(Collections.min(Arrays.asList(arr))); //min() expects list Arrays.asList() converts array to list but with a catch 
	}
	
}
