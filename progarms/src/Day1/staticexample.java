package Day1;

public class staticexample {

	static int a=10; //static variable
	int b=20; //non static variable

	static void m1()//approach1
	{
		System.out.println("This is m1 static method");
	}
	void m2()//approach-2
	{
		System.out.println("This is m2 non-static method");
	}
	
	void m()//non static method approach-3
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(a);
		//System.out.println(b);
	m1();
	//m2();
	
	staticexample se=new staticexample();//non static can be accessed with objects
	System.out.println(se.b);
	se.m2();

	}

}
