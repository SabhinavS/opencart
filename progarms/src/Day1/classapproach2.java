package Day1;

public class classapproach2 {
	int sid;
	String sname;
	char grade;
	
	void show()
	
	{
		System.out.println(sid+"  "+sname+"  "+grade);
	}
	
	void setdata(int id, String name,char g)
	{
	
		sid=id;
		sname=name;
		grade=g;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
classapproach2 stu=new classapproach2();

stu.setdata(101,"Abhinav", 'A');
	
stu.show();

	}

}
