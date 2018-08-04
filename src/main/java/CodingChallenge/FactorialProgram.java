package CodingChallenge;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner src = new Scanner(System.in);
      System.out.println("Enter a number");
      int inNumber = src.nextInt();
      int product = 1;
      for (int i=1;i<=inNumber;i++)
      {
    	   product = i*product;    	   
      }
      
      System.out.println("Factorial of "+inNumber+" is "+product);
	}

}
