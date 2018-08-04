package CodingChallenge;

import java.util.Scanner;

public class GreatestSumAcrossDiagonal {

	public static void main(String[] args) {
	
			System.out.println("Enter the number of rows");
			Scanner src = new Scanner(System.in);
			int m =src.nextInt();
			System.out.println("Enter the number of columns");
			int n =src.nextInt();
			//declare the matrix
			int numberMatrix[][] = new int[m][n];
			int diagonalAbove =0,diagonalBelow =0;
			int k=0,l=0;
			int matrixOne[] =  new int[20];
			int matrixTwo[] =  new int[20];
			for(int i=0;i<m;i++)
			{
				for (int j=0;j<n;j++)
				{
					numberMatrix[i][j]=src.nextInt();
				}
			}
			int x=m,y=n;			
			for(int i=0;i<x-1;i++)
			{
				for(int j=0;j<y-1;j++)
				{
					
						diagonalAbove += numberMatrix[i][j];
						matrixOne[k] = numberMatrix[i][j];
						//System.out.println(matrixOne[k]);
						
						k++;
						
				}
				y--;
			}
			System.out.println(diagonalAbove);
			
			int a=m,b=n,z=0;
			for(int i=a-1;i>0;i--)
			{
				for(int j=b-1;j>z;j--)
				{				    
					    
						diagonalBelow += numberMatrix[i][j];
						matrixTwo[l] = numberMatrix[i][j];
						//System.out.println(matrixTwo[l]);
						l++;
					    
				}
				z++;
				a--;
			}
			System.out.println(diagonalBelow);
			if(diagonalAbove>diagonalBelow)
			{
				for(int i=0;i<k;i++)
				{
					System.out.println(matrixOne[i]);
				}
			}
			else
			{
				for(int i=0;i<l;i++)
				{
					System.out.println(matrixTwo[i]);
				}
			}
					
	}

}
