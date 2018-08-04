package CodingChallenge;

import java.util.Scanner;

public class MatrixInSpiralWay {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner src = new Scanner(System.in);
		int m =src.nextInt();
		System.out.println("Enter the number of columns");
		int n =src.nextInt();
		//declare the matrix
		int numberMatrix[][] = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				numberMatrix[i][j]=src.nextInt();
			}
		}
		
		// starting row index
		int k=0;
		// starting column index
		int l=0;
		// declaring iterator
		int i;
		
		while(k<m && l<n)
		{
			for(i=k;i<n;i++)
			{
				System.out.println(numberMatrix[k][i]);
			}
			k++;
			for(i=k;i<m;i++)
			{
				System.out.println(numberMatrix[i][n-1]);
			}
			n--;
			if(k<m)
			{
			  for(i=n-1;i>=l;i--)
			  {
				  System.out.println(numberMatrix[m-1][i]);
			  }
			  m--;
			  
			}
			if(l<n)
			{
				for (i=m-1;i>=k;i--)
				{
					System.out.println(numberMatrix[i][l]);
				}
				l++;
			}
		}

	}

}
