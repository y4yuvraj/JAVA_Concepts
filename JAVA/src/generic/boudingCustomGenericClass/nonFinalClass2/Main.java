package generic.boudingCustomGenericClass.nonFinalClass2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyGeneric<List<String>> obj1=new MyGeneric<>(Arrays.asList("yuv","singh","dadwal"));     
		System.out.println(obj1.perfomSomeOperation());
	}
}
