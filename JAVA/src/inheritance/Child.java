package inheritance;


public class Child extends Parent{

	int x;
	Child()
	{
		this(10);
		System.out.println("No arg Child Constructor"); //4
	}
	
	Child(int x)
	{
		super(x);
		//this.x=x;
		System.out.println("Arg Child Constructor"); //3
	}
	
}
