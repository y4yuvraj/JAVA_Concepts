package generic.customGenericClass;

public class Main {

	public static void main(String[] args) {
		MyGeneric<String> obj1=new MyGeneric<>("yuv");
		System.out.println(obj1.perfomSomeOperation());
		MyGeneric<Integer> obj2=new MyGeneric<>(1);
		System.out.println(obj2.perfomSomeOperation());

	}

}
