package practise;

import java.util.Scanner;

public class Palindrome164461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value " +sc);
	//	int num=sc.nextInt();
		String num =sc.next();
		
		StringBuffer sb = new StringBuffer(String.format(num, args));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
			
			}
			
		}
		
	


