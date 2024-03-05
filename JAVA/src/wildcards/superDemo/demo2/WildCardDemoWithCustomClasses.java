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
		ArrayList<B> arrayList2 = new ArrayList<>(Arrays.asList(new B()));
		obj.m1(arrayList1);
		
		ArrayList<Number> l2=new ArrayList<>(Arrays.asList(Integer.valueOf(0),Double.valueOf(2.0),Float.valueOf(0.3f)));
		System.out.println(l2+" this is allowed");
	}
	
}
