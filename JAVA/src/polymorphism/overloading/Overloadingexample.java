package polymorphism.overloading;

public class Overloadingexample {

	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public String add(String a,String b)
	{
		return a+b;
	}
	
//	public String add(int a,int b)  this is not allowed as return type can not be considered towards signature
//	{								signature is just arguments of method and we already have this method
//		return a+b;					that takes two int values
//	}
	
	public static void main(String[] args) {
		Overloadingexample obj=new Overloadingexample();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add("1","2"));
		System.out.println(obj.add(1,2,3));
		
	}

}
/* 
op: 
3
12
6
 */
