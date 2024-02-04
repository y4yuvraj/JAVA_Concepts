package abstraction;

public class ChildAbstractClass extends ParentAbstractClass {

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		System.out.println("implementing abstract method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstractClass obj=new ChildAbstractClass();
		//ParentAbstractClass obj2=new ParentAbstractClass();   cannot instantiate abstract class
		obj.abstractMethod1();
		obj.nonAbstractMethod2();

	}

}
