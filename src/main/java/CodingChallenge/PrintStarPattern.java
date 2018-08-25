package CodingChallenge;

import java.util.Scanner;

public class PrintStarPattern {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int i,j,k;
		// given number is an even number
		if(n%2==0)
		{
			System.out.println("Enter an odd number");
		}
		//odd number
		else
		{
			for(i=1;i<(n/2)+1;i++)
			{  
				for(j=i;j<=n/2;j++)
				{   //column spaces
					System.out.print(" ");
				}
				for(k=1;k<(i*2);k++)
				{ // printing the numbers
					System.out.print(k);
				}
				// nextline
				System.out.println();
			}
			for(i=(n/2)+1;i>=1;i--)
			{
				for(j=(n/2);j>=i;j--)
				{
					System.out.print(" ");
				}
				for(k=1;k<(i*2);k++)
				{
					System.out.print(k);
				}
				System.out.println();
			}
		}

	}

}
