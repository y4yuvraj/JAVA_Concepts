package interfaceConcepts.twoInterfaceWithSameMethod;

public class MainClass implements Interface1, Interface2 {

	@Override
	public void method1() {
		// if method is same we give only 1 implementation for both method
		System.out.println("same method in both interfaces");
	}

	@Override
	public void method2(int x) {
		// if signature is different but name is same we implement both method
		System.out.println("method2 from interface 2");
	}

	@Override
	public void method2() {
		// if signature is different but name is same we implement both method
		System.out.println("method2 from interface 1");
	}

	//if signature is same and only return type is different then we cannot implement those method
	//if signature is different and return type is different then we can
	@Override
	public void method3() {
		System.out.println("inside method 3");
	}

	@Override
	public int method3(int x) {
		System.out.println("inside method 3");
		return 0;
	}

}
