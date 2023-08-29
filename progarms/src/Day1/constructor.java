package Day1;

public class constructor {
	int x,y;
	String s;
	
	constructor()//constructor nae=me should be same as class
	{
	x= 200;
	s="welcome";
	}
/*	constructor(int a,int b,String str)
	{
		x=a;
		y=b;
		s=str;
	}*/
	void displaydata()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//constructor c=new constructor(10,20,"welcome");//
		constructor c=new constructor();
c.displaydata();

	}

}
