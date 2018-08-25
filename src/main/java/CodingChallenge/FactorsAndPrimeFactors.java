package CodingChallenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FactorsAndPrimeFactors {
	
	public void factor(int number)
	{
	   	
		for(int i=1;i<=number;i++)
		{
				if(number%i==0)
				{
					System.out.println(i);
				}
		}		
	}
	
	public static void primeFactor(int number)
	{
	   	int factor  = 1;
	   	int primeFlag = 1,j,k;
	   	Set<Integer> factors = new HashSet<Integer>();
		for(int i=2;i<number;i++)
		{
			primeFlag = 1;
				if(number%i==0)
				{
					
					for(k=2;k<i;k++)
					{
						if(i%k==0)
						{
							primeFlag = 0;
							break;
						}
						
					}	
					if(primeFlag == 1)
					{
						
						factors.add(i);
					}
				}
		}	
		System.out.println(factors);
	}

	public static void main(String[] args) {
		FactorsAndPrimeFactors pf = new FactorsAndPrimeFactors();
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = src.nextInt();
		System.out.println("Factors are :");
		pf.factor(number);
		System.out.println("Prime Factors are :");
		primeFactor(number);

	}

}
