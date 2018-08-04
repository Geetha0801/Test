package CodingChallenge;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {

		System.out.println("Enter the numbers");
		Scanner src =  new Scanner(System.in);
		//int count = src.nextInt();		
		int numberOne = src.nextInt();
		int numberTwo = src.nextInt();
		//int number;
		for(int i=numberOne;i<=numberTwo;i++)
		{
			if((i%3 == 0) && (i%5 ==0))
			{
				System.out.println("FIZZBUZZ");
			}
			else if(i%3 ==0)
			{
				System.out.println("FIZZ");
			}
			else if(i%5 ==0)
			{
				System.out.println("BUZZ");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
