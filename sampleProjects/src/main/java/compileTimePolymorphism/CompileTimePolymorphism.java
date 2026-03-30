package compileTimePolymorphism;

public class CompileTimePolymorphism {

	public void add(int a, int b) {
		int c=0;
		c=a+b;
		System.out.println("Sum is "+ c);
	}
	public void add(double a, double b) {
		double c=0;
		c=a+b;
		System.out.println("Sum is (double) "+ c);
	}
	public void add() {
		
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		CompileTimePolymorphism ctp=new CompileTimePolymorphism();
		ctp.add();
		ctp.add(2,3);
		ctp.add(20,30);
		ctp.add(50.5,40);
		
 
	}

}
