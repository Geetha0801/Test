package CodingChallenge;

import java.util.Scanner;

public class DaysInAMonth {

	public static void main(String[] args) {
		System.out.println("Enter the month number:");
		Scanner src = new Scanner(System.in);
		int month = src.nextInt();
		System.out.println("Enter the year");
		int year = src.nextInt();
		int lyearflg = 0,days = 0;
		if(year%100== 0)				
		{   
			if(year%400 == 0)
			{
			   days = 29;
			}
			else
			{
				days = 28;
			}
		}			
		else if(year%4 ==0)
		{
			days = 29;
		}
		else
		{
			days = 28;
		}
		switch(month)
		{
		case 1:
		      System.out.println("31");
		      break;
		case 2:
			  System.out.println(days);
			  break; 
		case 3:
			System.out.println("31");
			  break; 
		case 4:
			System.out.println("30");
			  break;
		case 5:
			System.out.println("31");
			  break;
		case 6:
			System.out.println("30");
		      break;
		case 7:
			System.out.println("31");
			  break; 
		case 8:
			System.out.println("31");
			  break; 
		case 9:
			System.out.println("30");
			  break;
		case 10:
			System.out.println("31");
			  break;
		case 11:
			System.out.println("30");
			  break;	
		case 12:
			System.out.println("31");
			  break;
		default:
			System.out.println("Enter the valid month");
		}
	}
	}


