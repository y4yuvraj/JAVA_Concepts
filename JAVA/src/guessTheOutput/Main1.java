package guessTheOutput;

class Parent {
	
	private void print() {
		System.out.println("Parent");
	}

//	public void print() {
//		System.out.println("Parent");
//	}

	public void display() {
		print();
	}

}

class Child extends Parent {
	public void print() {
		System.out.println("Child");
	}
}

public class Main1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}
}
