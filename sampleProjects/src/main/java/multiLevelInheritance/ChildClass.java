package multiLevelInheritance;

public class ChildClass extends ParentClass{

	public void childMethod()
	{
		System.out.println("This is child method");
	}
	public static void main(String[] args) {
		
		ChildClass chObj=new ChildClass();
		chObj.childMethod();
		chObj.parentMethod();
		chObj.grantParentMethod();
		
	}

}
