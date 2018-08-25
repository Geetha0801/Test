package CodingChallenge;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String text;
		System.out.println("Enter the  string");
		Scanner src = new Scanner(System.in);
		text = src.nextLine();
		int count = 0;
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||
					text.charAt(i)=='o'||text.charAt(i)=='u')
			{
				count ++;
			}
		}
		System.out.println(count);
		

	}

}
