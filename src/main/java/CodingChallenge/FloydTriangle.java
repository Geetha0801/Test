package CodingChallenge;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		//Get the number of rows from user
		System.out.println("Enter the Number of Rows");
		Scanner src = new Scanner(System.in);
		int numberOfRows = src.nextInt();
		int k =1;
		// loop for number of rows
		for(int i=1 ;i<=numberOfRows;i++)
		{
			//  loop for number of columns
			for (int j=1;j<=i;j++)
			{
				// to print the numbers in each row
				System.out.print(k+" ");
				k++;
			}
			// to start the next row in next line
			System.out.print('\n');
		}
		

	}

}
