package enums;

public enum EnumConcept {
	A(2),
	B,
	C;
	
	int val;
	
	EnumConcept(int val)
	{
		this.val=val;
	}

	EnumConcept() {

	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	
	
}
