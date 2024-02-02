package accessSpecifier2;

import accessSpecifier1.AccessSpecifier1;

public class AccessSpecifier2 extends AccessSpecifier1{

	public static void main(String[] args) {
		AccessSpecifier2 obj=new AccessSpecifier2();
		// System.out.println("private n1: "+obj.n1); not accessible outside class
		System.out.println("public n2: "+obj.n2);
		System.out.println("protected n3: "+obj.n3);
		// System.out.println("default n4: "+obj.n4); not accessible outside package
	}
	
}
