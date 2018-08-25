package CodingChallenge;

import java.util.Scanner;

public class DigitsInAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner src = new Scanner(System.in);
		String number = src.nextLine();
		int length = number.length();
		char[] value = number.toCharArray();
		char temp;
		for (int i=0;i<length;i++) 
		{
			for(int j=i+1;j<length;j++)
			{
			if(value[i]>value[j])
			{
				temp = value[i];
				value[i] = value[j];
				value[j] = temp;
			}
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(value[i]);
		}

	}

}
