package interfaceConcepts.defaultAndStaticMethod;

public interface Interface2 {

//we give same methods
	
	public default void method1()
	{
		System.out.println("Inside default method in interface2");
	} 
	
	public static void method2()
	{
		System.out.println("Inside static method in interface2");
	}
	
	void method3();
	
}

