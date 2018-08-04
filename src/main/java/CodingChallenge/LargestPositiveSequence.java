package CodingChallenge;

import java.util.Scanner;

public class LargestPositiveSequence {

	public static void main(String[] args) {
		System.out.println("Enter the count");
		// get the input from user
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int []givenSequence = new int[n];
		// get the numbers
		for(int i=0;i<n;i++)
		{ 
			givenSequence[i]=src.nextInt();
		}
		//initializing a temporary variable
		int curIdx=0,curLen=0,maxLen=0,maxIdx=0;
		for(int i=0;i<n;i++)
		{
			if(givenSequence[i]>0)
			{
				curLen++;
				if(curLen == 1)
					curIdx = i;
			}
			else {
				if(curLen > maxLen)
				{
					maxLen = curLen;
					maxIdx = curIdx;
				}
			curLen = 0;
			}
		} 

	
	if(maxLen > 0)
	{
        for(int i=maxIdx;i<maxLen;i++)
        {
        	System.out.println(givenSequence[i]);
        }
	}
	else
	{
		System.out.println("No positive sequence found");
	}

}
	
}
	
