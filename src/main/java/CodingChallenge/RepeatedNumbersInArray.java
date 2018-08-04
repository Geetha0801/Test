package CodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class RepeatedNumbersInArray {

	public static void main(String[] args) {
		int[] a= {13,65,15,67,88,65,13,99,67,13,65,87,13};
		Set<Integer> resultSet = new HashSet<Integer>();
		int size = a.length;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				if(a[i]==a[j])
				{
					resultSet.add(a[i]);				
					
				}
			}
		}
		for(int result : resultSet)
		{
			System.out.println(result);
		}
	}	

}
