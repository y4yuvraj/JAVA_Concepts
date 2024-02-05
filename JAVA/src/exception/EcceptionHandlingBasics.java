package exception;
import java.lang.*;

public class EcceptionHandlingBasics {

	public static void main(String[] args) {
		
		//runtime and compile time 
		
		//ArithmeticException
		try {
			System.out.println(2/0); 
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		//Null pointer Exception
		try {
			String s = null;
			s.length();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		//ArrayIndexOutOfBound Exception
		try {
			int [] arr= {1};
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		//Custom checked exception
		try {
			throw new CustomCheckedException("throwing the custom checked exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		
	}
	
}
