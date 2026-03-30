package runtimePolymorphism;

public class RuntimePolymorphismChildClass extends RuntimePolyMorphisnParentClass{

	public void runtimePolyMethod()
	{
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		

		RuntimePolymorphismChildClass obj1=new RuntimePolymorphismChildClass();
		obj1.runtimePolyMethod();
		RuntimePolyMorphisnParentClass obj2=new RuntimePolymorphismChildClass(); //upcasting 
		obj2.runtimePolyMethod();
	}

}
