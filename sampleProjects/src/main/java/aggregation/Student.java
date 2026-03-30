package aggregation;

public class Student {
	int c;
	int d;
	School obj;
	
	public void method1(int c, int d, School obj) {
		this.c=c;
		this.d=d;
		this.obj=obj;
	}
	
	public void print()
	{
		System.out.println(c +" "+d);
		System.out.println(obj.a +" "+obj.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School sch=new School();
		sch.method1(5, 2);
		Student stu=new Student();
		stu.method1(44, 22, sch);
		stu.print();
	}

}
