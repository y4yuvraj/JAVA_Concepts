package basics.passbyValueUsingPrimitve;

public class Main {

	public static void main(String[] args) {
		int x,y;
		x=1;
		y=2;
		swap(x,y);
		System.out.println("after method");
		System.out.println("x= "+x+" y="+y);
	}

	//java is pass by value for primitve data types
	
	private static void swap(int x, int y) {
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("inside method");
		System.out.println("x= "+x+" y="+y);
	}
	
}
