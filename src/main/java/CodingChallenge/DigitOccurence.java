package CodingChallenge;

import java.util.Scanner;

public class DigitOccurence {

	public static void main(String[] args) {
		// Get the number and digit from user
		System.out.println("Enter the number");
		Scanner src =  new Scanner(System.in);
		int givenNumber = src.nextInt();
		System.out.println("Enter the digit");
		int givenDigit = src.nextInt();
		// initialize variables to find the occurence of given digit
		int n,k,count;
		for(int i=givenNumber-1;i>=1;i--)
		{
			n=i;
			count = 0;
			// loop to find the digit in number given
			while(n!=0)
			{
				k = n%10;
				n= n/10;
				if(k == givenDigit)
				{
					count++;
					break;
				}
			}
			//if there is no digit find, print the number
			{
				System.out.println("Result is "+i);
				break;
			}
		}

	}

}
