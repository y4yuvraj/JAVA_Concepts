package generic.restrictingCustomGenericClass.nonFinalClass;

public class Main {

	public static void main(String[] args) {
//		MyGeneric<String> obj1=new MyGeneric<>("yuv");      not allowed
//		System.out.println(obj1.perfomSomeOperation());
//		MyGeneric<Integer> obj2=new MyGeneric<>(1);         not allowed
//		System.out.println(obj2.perfomSomeOperation()); 
		MyGeneric<MyClass> obj1=new MyGeneric<>(new MyClass(2)); 
		System.out.println(obj1.perfomSomeOperation());
	}

}
