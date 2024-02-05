package inheritance.shadowing;

public class MainClass {

	
	public static void main(String[] args) {
		Child obj = new Child(1,2,3); //we are passing 1 to commonField but this commonField is also in Child class
		System.out.println(obj.commonField+" "+obj.uncommonField1+" "+obj.childField); //op 0 2 3 and not 1 2 3
		System.out.println(((Parent) obj).commonField);
		
	}
}
