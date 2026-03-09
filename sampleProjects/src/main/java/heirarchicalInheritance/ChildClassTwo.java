package heirarchicalInheritance;

public class ChildClassTwo extends ParentClass {

	public void childMethodTwo() {
		System.out.println("This is method of second child");
	}
	public static void main(String[] args) {
		
		ChildClassTwo chObjTwo=new ChildClassTwo();
		chObjTwo.childMethodTwo();
		chObjTwo.parentMethod();
	}

}
