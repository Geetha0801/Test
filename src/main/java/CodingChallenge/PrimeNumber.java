package CodingChallenge;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the value of numbers");
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int primeFlag = 0;

		for (int k=1 ; k<=n ;k++)
		{   
			primeFlag = 0;			
			int divident = k/2;
			for (int i=2;i<=divident;i++)
			{
				if((k%i)== 0)
				{
					primeFlag = 1;
					break;
				}			
				

			}
			if(primeFlag == 0)
			{
				System.out.println(k);
			}
		}	


	}

}
