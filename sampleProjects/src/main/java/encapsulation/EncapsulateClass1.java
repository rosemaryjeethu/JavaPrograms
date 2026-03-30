package encapsulation;

public class EncapsulateClass1 {
	
	private String name;
	private int age;
	private double sal;
	
	public void setMethod(String name, int age, double sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public void getMethod()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Salary is "+sal);
	}
}
