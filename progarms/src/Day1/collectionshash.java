package Day1;

import java.io.ObjectInput;
import java.util.HashSet;//All collections availablein  

public class collectionshash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet myset=new HashSet();
	
	//HashSet <String>myset=new hashSet<String>();
	myset.add(200);
	myset.add(10.5);
	myset.add("Abhinav");
	myset.add(200);
	myset.add(null);
	
	System.out.println(myset.remove(null));
	System.out.println(myset);
	
	for(Object  x:myset)
	{
	System.out.println(x);
	}

}}
