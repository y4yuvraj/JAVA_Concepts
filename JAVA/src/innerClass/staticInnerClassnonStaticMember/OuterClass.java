package innerClass.staticInnerClassnonStaticMember;

public class OuterClass {

	void m1()
	{
		System.out.println("outer class method");
	}
	
	static class InnerClass
	{
		void m2()
		{
			System.out.println("inner class method");
		}
	}
	
	public static void main(String[] args) {
		//accessing outer method
		OuterClass ob1=new OuterClass();
		ob1.m1();
		OuterClass.InnerClass ob2 = new OuterClass.InnerClass();
		ob2.m2();
	}
	
}