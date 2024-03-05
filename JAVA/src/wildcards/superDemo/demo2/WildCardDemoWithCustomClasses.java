package wildcards.superDemo.demo2;

import java.util.ArrayList;
import java.util.Arrays;

class A {}

class B extends A {}

public class WildCardDemoWithCustomClasses {

	public void m1(ArrayList<? super B> list )
	{
		list.add(new B());
		list.add(new B());
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		WildCardDemoWithCustomClasses obj= new WildCardDemoWithCustomClasses();
		ArrayList<A> arrayList1 = new ArrayList<>(Arrays.asList(new A(),new B()));
		obj.m1(arrayList1);
		
	}
	
}
