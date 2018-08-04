package week2homework;

import java.util.Scanner;

public class LearningRelationalOperators {

	public static void main(String[] args) {
		int numberOne, numberTwo;
		System.out.println("Enter the Numbers");
		Scanner src =  new Scanner(System.in);
		numberOne = src.nextInt();
		numberTwo = src.nextInt();
		
		if(numberOne>numberTwo)
		System.out.println("LargestOfTwo :"+numberOne);
		
		if(numberOne<numberTwo)
		System.out.println("SmallestOfTwo :"+numberOne);
		
		if(numberOne>=numberTwo)
			System.out.println("Greaterthanorequalto");
		
		if(numberOne<=numberTwo)
			System.out.println("Lesserthanorequalto");
		
		if(numberOne==numberTwo)
			System.out.println("equalto");
		
		if(numberOne!=numberTwo)
			System.out.println("notequalto");
		
	}


}
