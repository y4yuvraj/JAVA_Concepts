package staticContext;

class Parent{
	static void commonMethod()
	{
		System.out.println("Parents static Method");
	}
}

class Child extends Parent{
	
	static void commonMethod()
	{
		System.out.println("Childs static Method");
	}
}


public class OverrideStaticMethod {

	public static void main(String[] args) {
		Child obj1=new Child();
		Parent obj2=new Child();
		obj1.commonMethod(); //Child method runs
		obj2.commonMethod(); //Parent method runs but if it was actually overriding
		//and if runtime polymorphism would actually be happening here in both cases childs overidden method should have run
	}

}
