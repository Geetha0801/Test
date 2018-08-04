package CodingChallenge;

import java.util.Scanner;

public class AirthmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner src =  new Scanner(System.in);
		int numberOne = src.nextInt();
		int numberTwo = src.nextInt();
		System.out.println("Enter the operatio to be performed");
		String operations = src.next();
		switch(operations)
		{
		case "Add":
			int sum = numberOne + numberTwo;
			System.out.println("Addition: "+sum);
			break;
		case "Substract":
			int difference = numberOne - numberTwo;
			System.out.println("Substract: "+difference);
			break;
		case "Multiply":
			int product = numberOne * numberTwo;
			System.out.println("Mulitiplication: "+product);
			break;
		case "Divide":
			int quotient = numberOne / numberTwo;
			System.out.println("Division: "+quotient);
			break;
		default:
			System.out.println("Enter the valid operations");
			break;	
			
		}

	}

}
