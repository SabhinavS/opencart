package Day1;

import java.util.HashMap;
import java.util.Map;

public class collectionhashmap {

	public static void main(String[] args) {
	
	//HashMap hm=new HashMap();		
	//Map hm=new HashMap();	
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(101, "john");
	hm.put(101, "david");//John replaced by duplicate value david
	hm.put(102, "Tom");
	hm.put(103, "Steve");
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.remove(102));
	System.out.println(hm.get(101));
	System.out.println(hm.keySet());
	System.out.println(hm);
	
	for(Object k:hm.keySet())
	{
	
		System.out.println(k+"     "+hm.get(k));
	}
hm.clear();
System.out.println(hm);
}}
