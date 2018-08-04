package CodingChallenge;

import java.util.Scanner;

public class SecondMaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int numberArray[] = new int[n];
				
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the number"+(i+1));
            numberArray[i]=src.nextInt();         
					
		}
		for (int i=0;i<n-1;i++)
		{
			int temp;
			for (int j=i+1;j<n;j++)
			{
			if(numberArray[i] < numberArray[j])
			{
				temp  = numberArray[i];
				numberArray[i] = numberArray[j];
				numberArray[j] = temp;
			
			}
		}
			
		}
	  System.out.println(numberArray[1]);
		
	}
}
		


