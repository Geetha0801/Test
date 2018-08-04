package week2homework;

import java.util.Scanner;

public class LearningArithmeticOperators {

	public static void main(String[] args) {
		int numberOne, numberTwo;
		System.out.println("Enter the Numbers");
		Scanner src =  new Scanner(System.in);
		numberOne = src.nextInt();
		numberTwo = src.nextInt();
		
		System.out.println("Addition :"+(numberOne+numberTwo));
		System.out.println("Substraction :"+(numberOne-numberTwo));
		System.out.println("Addition :"+(numberOne*numberTwo));
		System.out.println("Addition :"+(numberOne/numberTwo));
		
	}

}
