package generic.boudingCustomGenericClass.nonFinalClass2;

import java.util.ArrayList;
import java.util.List;

// we want this generic class to only accept MyClass Type objects 

public class MyGeneric<T extends List<?>> {

	public T obj;
	public MyGeneric(T obj) {
		super();
		this.obj = obj;
		this.obj.size();
		ArrayList<String> arrayList =(ArrayList<String>)obj;
		arrayList.trimToSize();
	}
	
	public T perfomSomeOperation()
	{
		System.out.println("Type of object "+obj.getClass().getName());
		return obj;
	}
	
	
	public static <T> T m1(T t)
	{
		return t;
	}
	
}
