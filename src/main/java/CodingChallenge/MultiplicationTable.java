package CodingChallenge;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the #1 number");
		int numberOne = src.nextInt();
		System.out.println("Enter the #2 number");
		int numberTwo = src.nextInt();
		
		for(int i=1;i <=numberTwo; i++)
		{
			int nProduct = i*numberOne;
			System.out.println(+i+" * "+numberOne+" = "+nProduct);
		}
		

	}

}
