package CodingChallenge;

import java.util.Scanner;

public class SumOfnumbersInArray {

	public static void main(String[] args) {
		int numberArray[] = new int[7];
		int sumArray = 0;	
		Scanner src = new Scanner(System.in);		
		for (int i=0;i<7;i++)
		{
			System.out.println("Enter the number"+(i+1));
			numberArray[i]=src.nextInt();         

		}
		for (int i=0;i<7;i++)
		{

			sumArray  += numberArray[i];

		}
		System.out.println("Sum : "+sumArray);
	}

}
