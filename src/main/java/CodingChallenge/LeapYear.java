package CodingChallenge;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//declare variable
		int year;
		System.out.println("Enter the year");
		// get year from user
		Scanner src = new Scanner(System.in);
		year = src.nextInt();
		if(year%100== 0)				
		{   
			if(year%400 == 0)
			{
			System.out.println("Given year "+year+" is leap year");
			}
			else
			{
			System.out.println("Given year "+year+" is not a leap year");	
			}
		}			
		else if(year%4 ==0)
		{
			System.out.println("Given year "+year+" is  a leap year");
		}
		else
		{
			System.out.println("Given year "+year+" is not  a leap year");
		}
	}

}
