package wildcards.superDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class WildCardDemo {

	public void m1(ArrayList<? super Integer> list )
	{
		list.add(100);
		list.add(Integer.valueOf(0));
		System.out.println(list);
		list.remove(Integer.valueOf(100));
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		WildCardDemo obj=new WildCardDemo();
		ArrayList<Integer> l1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Number> l2= new ArrayList<>(Arrays.asList(11,12,13,14,15));
		obj.m1(l1);
		obj.m1(l2);
	}
	
}
