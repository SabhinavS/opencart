package Day1;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String s=new String("Welcome");	
	String s="Welcome";	
		System.out.println(s);
		//Length of a string
		System.out.println(s.length());
		//concat() joining strings
		
	String a=" WelcometoJava ";
	String b="Program";
	String c="class";
	//System.out.println(a+b);
	System.out.println(a.concat(b).concat(c));
	//Trim-remove right and left spaces
	
	//System.out.println(a.trim());
	//Charat method returns index value of string
	//System.out.println(a.charAt(3));
	//Contains() 
	//System.out.println(a.contains("Wel"));
	
	String x="Welcome";
	String y="welcome";
	System.out.println(x.equals(y));
	System.out.println(x.equalsIgnoreCase(y));//Ignore capitals
//replace the value with another
	System.out.println(a.replace("Java", "Selenium"));
	//System.out.println(x.replace('e','w'));
	//Substring returns value between string using index num
	System.out.println(x.substring(0,6));
//	String z="abhinav@sheela@student";
//String a[]=z.split("@");
	String z="WELCOME";
System.out.println(z.toLowerCase());
	
String p=new String("Sai");
String q=new String("Sai");
System.out.println(p.equals(q));
System.out.println(p==q);
	
	}

}
