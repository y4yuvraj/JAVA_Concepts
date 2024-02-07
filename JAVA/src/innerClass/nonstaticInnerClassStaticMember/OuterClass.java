package innerClass.nonstaticInnerClassStaticMember;

public class OuterClass {

	void m1()
	{
		System.out.println("outer class method");
	}
	
	class InnerClass
	{
		static void m2()
		{
			System.out.println("inner class method");
		}
	}
	
	public static void main(String[] args) {
		//accessing outer method
		OuterClass ob1=new OuterClass();
		ob1.m1();
		InnerClass.m2();
	}
	
}
