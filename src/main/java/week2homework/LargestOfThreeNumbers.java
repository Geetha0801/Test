package week2homework;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int numberOne,numberTwo,numberThree;
		System.out.println("Enter the 3 Numbers");
		Scanner src =  new Scanner(System.in);
		numberOne = src.nextInt();
		numberTwo = src.nextInt();
		numberThree = src.nextInt();

		 if((numberOne>numberTwo)&&(numberOne>numberThree))
		 {
		 System.out.println(+numberOne+" is greatest");
		 }
		 else if(numberTwo>numberThree)
		 {
			 System.out.println(+numberTwo+" is greatest"); 
		 }
		 else
		 {
			 System.out.println(+numberThree+" is greatest");
		 }	 

	}

}
