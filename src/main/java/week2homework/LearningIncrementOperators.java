package week2homework;

import java.util.Scanner;

public class LearningIncrementOperators {

	public static void main(String[] args) {
		int numberOne;
		System.out.println("Enter the Numbers");
		Scanner src =  new Scanner(System.in);
		numberOne = src.nextInt();
		//numberTwo = src.nextInt();
		
		System.out.println("PostIncrement :"+(numberOne++));
		System.out.println("PreIncrement :"+(++numberOne));
		System.out.println("PostDecrement :"+(numberOne--));
		System.out.println("PostIncrement :"+(--numberOne));
		
	}
}
