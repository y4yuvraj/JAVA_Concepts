package inheritance.shadowing;

public class Child extends Parent{

	public int commonField;
	public int childField;
	
	public Child(int commonField, int uncommonField1,int childField) {
		super(commonField, uncommonField1);
		this.childField=childField;
	}

	
}
