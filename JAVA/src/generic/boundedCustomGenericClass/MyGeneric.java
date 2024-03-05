package generic.boundedCustomGenericClass;
//since String Class is final it cannot be extended
//so we can not restrict normally like MyGeneric<T extends String> 
public class MyGeneric<T> {

	public T obj;

	private MyGeneric(T obj) {
		super();
		this.obj = obj;
	}
	
	public static MyGeneric<String> createObject(String value)
	{
		return new MyGeneric<>(value);
	}
	
	public T perfomSomeOperation()
	{
		System.out.println("Type of object "+obj.getClass().getName());
		return obj;
	}
	
}
