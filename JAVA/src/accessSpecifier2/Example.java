package accessSpecifier2;

import accessSpecifier1.AccessSpecifier1;

public class Example {
public static void main(String[] args) {
	AccessSpecifier1 obj=new AccessSpecifier1(); //we are inside other package
	//System.out.println("private n1: "+obj.n1); not inside same class
	System.out.println("public n2: "+obj.n2);
	//System.out.println("protected n3: "+obj.n3); outside package
	//System.out.println("default n4: "+obj.n4); outside package
}
}
