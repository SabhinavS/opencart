package practise;

import java.util.Scanner;

public class countevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();

int evencount=0;
int oddcount=0;

while(num>0) {  //12345--123
	int rem=num%10;{  //1234---12
		
		if(rem%2==0) { //yes
			evencount++;  //1
			
		}
		else {
			oddcount++;
		}
	}
num=num/10;  //1234/10--123
	
}
System.out.println("no of even numbers are "+evencount);
System.out.println("no of odd numbers are "+oddcount);
	}

}
