package Day1;

import java.util.Scanner;

public class fourthprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        // Create a Scanner object for user input
		       Scanner scanner = new Scanner(System.in);
		        
		        //System.out.print("Enter your age: ");
		       // int age = scanner.nextInt();
		System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
		       // if (age >= 18) {
		            //System.out.println("You are eligible to vote!");
		        }// else {
		           // System.out.println("You are not eligible to vote yet.");
		        }
	}


