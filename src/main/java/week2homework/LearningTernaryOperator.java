package week2homework;

import java.util.Scanner;

public class LearningTernaryOperator {

	public static void main(String[] args) {
		int numberOne,numberTwo;
		System.out.println("Enter the Numbers");
		Scanner src =  new Scanner(System.in);
		numberOne = src.nextInt();
		numberTwo = src.nextInt();

		System.out.println("Ternary Operator :"+(numberOne>numberTwo?numberOne:numberTwo));
	}

}
