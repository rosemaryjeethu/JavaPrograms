package superKeywordExample;

public class ChildClass extends ParentClass{

	
	int newValue=20;
	
	public void childMethod()
	{
		System.out.println(newValue);
		System.out.println(super.newValue);
	}
	
	public static void main(String[] args) {
		
		ChildClass chObj=new ChildClass();
		chObj.childMethod();

	}

}
