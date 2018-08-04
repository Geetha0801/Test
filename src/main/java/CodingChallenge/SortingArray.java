package CodingChallenge;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of values in array");
		int numberCount = src.nextInt();
		int numberArray[] = new int[numberCount];				
		for (int i=0;i<numberCount;i++)
		{
			System.out.println("Enter the number"+(i+1));
            numberArray[i]=src.nextInt();         
					
		}
		for (int i=0;i<numberCount-1;i++)
		{
			int temp;
			for (int j=i+1;j<numberCount;j++)
			{
			if(numberArray[i] > numberArray[j])
			{
				temp  = numberArray[i];
				numberArray[i] = numberArray[j];
				numberArray[j] = temp;
			
			}
		}
			
		}
		System.out.println("Ascending Order");
		for (int i=0;i<numberCount;i++)		
		{	
	      System.out.println(numberArray[i]);
		
		}
		System.out.println("Descending Order");
		for (int i=numberCount-1;i>=0;i--)		
		{	
	      System.out.println(numberArray[i]);
		
		}
}

}
