package Day1;

public class oops { //class


// TODO Auto-generated method stub
int eid;//variables and methods
String ename;
String job;
int sal;
	
void show() //void display used to create methods//void means methods not returning any data
{
System.out.println(eid);	
System.out.println(ename);	
System.out.println(job);
System.out.println(sal);
	}
public static void main(String[] args) 
		{
	//Apporoach-1 using reference variable
oops emp1=new oops();//create object1 emp1 in main method
emp1.eid=101;		//syntax:class.object=new class();
emp1.ename="john";
emp1.job="engineer";
emp1.sal=10000;
	emp1.show();

oops emp2=new oops();//create object2 emp1 in main method
emp2.eid=102;
emp2.ename="Steve";
emp2.job="Accountant";
emp2.sal=15000;	
	emp2.show(); //used the call the data in emp2 object
	
		}
}