package generic.genericAsSubType;

public class MyGeneric<T> implements Interface1<T> {

	private T obj;
	
	@Override
	public void set(T obj) {
		this.obj=obj;
	}

	@Override
	public T get() {
		return this.obj;
	}

	public static void main(String[] args) {
		MyGeneric<String> obj1= new MyGeneric<>();
		obj1.set("yuv");
		System.out.println(obj1.get());
	}
	
}
