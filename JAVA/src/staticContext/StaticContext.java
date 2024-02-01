package staticContext;

public class StaticContext {

	static {
		System.out.println("static block runs before everything"); //static block runs as soon as jvm loads program into memory
	}
	
	static void method1()
	{
		System.out.println("static method running");
	}
	
	{
		System.out.println("non static block runs everytime we create object of class before constructor is invoked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method running");
		StaticContext obj=new StaticContext();
		StaticContext.method1();
	}
}
/* 
static block runs before everything
Main method running
non static block runs everytime we create object of class before constructor is invoked
static method running
 */
