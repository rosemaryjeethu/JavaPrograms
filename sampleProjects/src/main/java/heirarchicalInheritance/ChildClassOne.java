package heirarchicalInheritance;

public class ChildClassOne extends ParentClass {
	
	public void childMethodOne() {
		System.out.println("This is method of first child");
	}
	public static void main(String[] args) {
		
		ChildClassOne chObjone=new ChildClassOne();
		chObjone.childMethodOne();
		chObjone.parentMethod();
	}

}
