package CodingChallenge;

import java.util.Scanner;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		int numberArray[] = new int[3];
		Scanner src = new Scanner(System.in);		
		for (int i=0;i<3;i++)
		{
			System.out.println("Enter the number"+(i+1));
            numberArray[i]=src.nextInt();         
					
		}
		for (int i=0;i<2;i++)
		{
			int temp;
			for (int j=i+1;j<3;j++)
			{
			if(numberArray[i] > numberArray[j])
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

