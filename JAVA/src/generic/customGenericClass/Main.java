package generic.customGenericClass;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyGeneric<String> obj1=new MyGeneric<>("yuv");
		System.out.println(obj1.perfomSomeOperation());
		MyGeneric<Integer> obj2=new MyGeneric<>(1);
		System.out.println(obj2.perfomSomeOperation());
		MyGeneric<List<String>> obj3=new MyGeneric<>(Arrays.asList("yuv","singh"));
		System.out.println(obj3.perfomSomeOperation());

	}

}
