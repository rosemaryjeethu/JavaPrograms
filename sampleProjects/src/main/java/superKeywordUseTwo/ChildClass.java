package superKeywordUseTwo;

public class ChildClass extends ParentClass{

	void newMethod()    //method overriding - same method name and parameters of parent class given in child class also is referred as method overriding
	{
		System.out.println("This is child class method");
		super.newMethod();
	}
	
	void display()
	{
		newMethod();
		super.newMethod();
	}
	public static void main(String[] args) {
		
		ChildClass chObj=new ChildClass();
	//	chObj.display();
		chObj.newMethod();
	}

}
