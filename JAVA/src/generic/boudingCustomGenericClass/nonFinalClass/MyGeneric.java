package generic.boudingCustomGenericClass.nonFinalClass;
// we want this generic class to only accept MyClass Type objects 

public class MyGeneric<T extends MyClass> {

	public T obj;

	public MyGeneric(T obj) {
		super();
		this.obj = obj;
	}
	
	public T perfomSomeOperation()
	{
		System.out.println("Type of object "+obj.getClass().getName());
		return obj;
	}
	
}
