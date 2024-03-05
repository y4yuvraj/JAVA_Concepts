package generic.boundedCustomGenericClass;

public class Main {

	public static void main(String[] args) {
		MyGeneric<String> obj1=MyGeneric.createObject("yuv");
		System.out.println(obj1.perfomSomeOperation());
//		MyGeneric<String> obj2=MyGeneric.createObject(123);  this wont work
//		System.out.println(obj2.perfomSomeOperation());

	}

}
