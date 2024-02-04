package interfaceConcepts.defaultAndStaticMethod;

public interface Interface1 {

	public default void method1()
	{
		System.out.println("Inside default method in interface1");
	} 
	
	public static void method2()
	{
		System.out.println("Inside static method in interface1");
	}
	
	void method3();
}
