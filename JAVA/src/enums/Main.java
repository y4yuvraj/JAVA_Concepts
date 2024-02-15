package enums;

public class Main {

	public static void main(String[] args) {
		EnumConcept x=EnumConcept.A;
		EnumConcept y=EnumConcept.B;
		System.out.println(x.getVal());
		y.setVal(4);
		System.out.println(y.getVal());
		EnumConcept [] arr=EnumConcept.values();
		System.out.println();
		for (EnumConcept enumConcept : arr) {
			System.out.println(enumConcept.ordinal());
		}
		
	}

}
