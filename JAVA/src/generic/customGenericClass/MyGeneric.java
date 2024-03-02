package generic.customGenericClass;

public class MyGeneric<T> {

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
