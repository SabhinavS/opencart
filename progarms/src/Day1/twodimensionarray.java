package Day1;

public class twodimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//approach-1 when we have limited value
		//int a[][]=new int[3][2];
		
		//int a[0][0]=100;
		//int a[0][1]=200;
		
		int a[][]= {{10,20,30},
				{30,40,60},
				{50,60,70}};	
	//prints rows	System.out.println(a[0].length);
		//print columns System.out.println(a.length);
		//System.out.println(a[2][1]);
	for(int r=0;r<a.length;r++)
	{
	for(int c=0;c<a[r].length;c++)
	{
		System.out.println(a[r][c]+"  ");
	}
	System.out.println();
	}

}}
