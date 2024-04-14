package java8.streams.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static Integer myMethod() {
		System.out.println("inside method");
		return 999;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9));
		Integer orElse = list.stream().filter((x) -> x % 2 == 0).findAny().orElse(myMethod());
		System.out.println(orElse);
	}

}
