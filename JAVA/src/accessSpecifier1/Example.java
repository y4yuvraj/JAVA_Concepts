package accessSpecifier1;

public class Example {
 public static void main(String[] args) {
	AccessSpecifier1 obj=new AccessSpecifier1();
//	System.out.println("private n1: "+obj.n1); outside class
	System.out.println("public n2: "+obj.n2);
	System.out.println("protected n3: "+obj.n3);
	System.out.println("default n4: "+obj.n4);

}
}
