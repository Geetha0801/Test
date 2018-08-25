package CodingChallenge;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner src = new Scanner(System.in);
		int number = src.nextInt();
		int result = 0;
		for(int i=1;i<number;i++)
		{
			if(number%i == 0)
			{
				result = result+i;
				
			}
		}
		if(result == number)
			System.out.println("Given number is perfect number");
		else
			System.out.println("Given number is not a perfect number");

	}

}
