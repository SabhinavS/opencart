package practise;

import java.util.Scanner;

public class countnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		int c=0;
		   
		while(num>0) { 
			num=num/10;
			c++;
			
		}
		System.out.println("no of digits in the above number is " +c);
	
	}

}
