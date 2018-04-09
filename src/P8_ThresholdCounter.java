/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P8_ThresholdCounter{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many numbers are in the series?");
		int numberCount = console.nextInt();
		
		System.out.println("What is the threshold?");
		int threshold = console.nextInt();		
		int numberAbove = 0;
		
		for (int repetition = 1; repetition <= numberCount; repetition++){
			System.out.println("What is number " + repetition);
			int numberInput = console.nextInt();
			if (numberInput > threshold){
				numberAbove++;
			}
		}
		
		System.out.println("The count of numbers above the threshold is " + numberAbove);		
	}
}
