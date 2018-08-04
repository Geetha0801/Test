package week2homework;

import java.util.Scanner;

public class LearningBitwiseOperators {

	public static void main(String[] args) {
		
			int numberOne = 60, numberTwo = 13;
			//System.out.println("Enter the Numbers");
			//Scanner src =  new Scanner(System.in);
			//numberOne = src.nextInt();
			//numberTwo = src.nextInt();
			
			System.out.println("BitwiseAnd :"+(numberOne&numberTwo));
			System.out.println("BitwiseOr :"+(numberOne|numberTwo));
			System.out.println("BitwiseXor :"+(numberOne^numberTwo));
			System.out.println("BitwiseCompliment :"+(~numberOne));
			System.out.println("Bitwiseleftshift :"+(numberOne<<2));
			System.out.println("BitwiseRightshift :"+(numberOne>>2));
			System.out.println("BitwiseZeroFillRightshift :"+(numberOne>>>2));
			
			
		}


	}


