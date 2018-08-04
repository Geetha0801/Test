package week1.day2;

import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) {
		
		String[] studentList = {"Geetha","Poomathi","Sindhu","Rani","Arjun"};
		int[] ageList = {26,27,25,34,39};
		char[][] gradeList = {{'A','A','A','A','A'},{'B','A','A','A','A'},{'A','A','C','A','A'},
				{'A','F','A','A','A'},{'F','F','F','F','F'}};		
	     //Scanner src =  new Scanner(System.in);
	     //System.out.println("Enter Student Number");
	     //int whichStudent = src.nextInt();
	     for (int i=0;i<5;i++)
	     {	
	    	 System.out.println(studentList[i]
		    		 + " whos age is "
		    		 + ageList[i]+" whose grade is "+gradeList[i][0]+" , "
		    		 +gradeList[i][1]+" , "
		    		 +gradeList[i][2]+" , "
		    		 +gradeList[i][3]+" , "
		    		 +gradeList[i][4]);
	       
	    		 
	     }
		}
	}
	


