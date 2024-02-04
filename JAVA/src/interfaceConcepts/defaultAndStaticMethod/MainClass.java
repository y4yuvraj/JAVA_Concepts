package interfaceConcepts.defaultAndStaticMethod;

public class MainClass implements Interface1, Interface2 {

	@Override
	public void method3() {
		System.out.println("method3 implemented");
	}

	@Override
	public void method1() {
		Interface1.super.method1();
		Interface2.super.method1();
		System.out.println("chose the implementation of default method we want");
	}
	
	public static void main(String[] args) {
		MainClass obj=new MainClass();
		Interface1.method2();
		Interface2.method2();
		obj.method1();
	}

}
