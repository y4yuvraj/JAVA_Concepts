package inheritance;

public class Parent {

	Parent()
	{
		System.out.println("No arg Parent Constructor"); //1
	}
	
	Parent(int x)
	{
		this();
		System.out.println("Arg Parent Constructor"); //2
	}
	
}
