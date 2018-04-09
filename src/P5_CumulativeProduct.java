/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P5_CumulativeProduct{
	public static void main(String[] args){
		System.out.println("How many numbers do you want to multiply?");		
		Scanner console = new Scanner(System.in);
		int numberOfNumbers = console.nextInt();
		int multipliedNumber = 1;
		
		for (int repetition = 1; repetition <= numberOfNumbers; repetition++){
			System.out.println("Enter number " + repetition + ": ");
			int number = console.nextInt();
			multipliedNumber = multipliedNumber * number;
			
		}
		
		System.out.println("The total number is: " + multipliedNumber);
	}
}