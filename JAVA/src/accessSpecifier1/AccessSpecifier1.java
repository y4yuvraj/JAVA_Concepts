package accessSpecifier1;

public class AccessSpecifier1 {

	private int n1=1; //accessible within this class only
	public int n2=2; //accessible everywhere
	protected int n3=3; //within the same package except in child classes
	int n4=4; //default- within same package
	
	public static void main(String[] args) {
		AccessSpecifier1 obj=new AccessSpecifier1();
		System.out.println("private n1: "+obj.n1);
		System.out.println("public n2: "+obj.n2);
		System.out.println("protected n3: "+obj.n3);
		System.out.println("default n4: "+obj.n4);
	}
	
	
}
