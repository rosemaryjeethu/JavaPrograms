package singleInheritance;

public class ChildClass extends ParentClass {

	public void childMethod()
	{
		System.out.println("This is child method");
	}
	public static void main(String[] args) {
		
		ChildClass childobj = new ChildClass();
		childobj.parentMethod();
		childobj.childMethod();
		
	}

}
