package CodingChallenge;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DigitsInAscendingOrder {

	public static void main(String[] args) {
		
   // declare the variable
		System.out.println("Enter the number");
		Scanner src = new Scanner(System.in);
		// get the number from user
		int  number = src.nextInt();
		// get the length of the number
		int length = String.valueOf(number).length();
		System.out.println(length);
		// declare a temporary variable
		int temp ;
		int[] result =  new int[length];
		int i = number,j=0;
		while(i != 0)
		{
			int remainder = i%10;
			i = i/10;
			result[j] = remainder;
			System.out.println(result[j]);
			j++;
		}	
		
//			for(int l=0;l<length-1;l++)
//			{
//				for(int k=l+1;k<length;k++)
//				{
//					if(result[l] > result[k])
//					{
//						
//						temp = result[l];
//						result[l] = result[k];
//						result[k]= temp;
//						
//					
//					}
//					
//					}
//			}
			
			Set<Integer> test = new TreeSet<Integer>();
		for(int k=0;k<length;k++)
			test.add(result[k]);
		for(int s : test)
		System.out.println(s);
	
		
	}
}

