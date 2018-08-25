package CodingChallenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// get the array size
		System.out.println("Enter the size of array");
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		// get the numbers from user
		int[] numberArray = new int[n];
		Set<Integer> resultArray = new TreeSet<Integer>();
        for(int i=0;i<n;i++)
        {
        	numberArray[i]=src.nextInt();
        }
        // searching for duplicates
        int k=0,count=0;
        for(int i=0;i<n-1;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if((numberArray[i]==numberArray[j]) && (i!=j))
        		{
        			resultArray.add(numberArray[j]);
        			k++;
           		}
        	 
        	}	
        }
        
        System.out.println("Duplicate numbers are:");
                	 
        	System.out.println(resultArray);
        
	}

}
