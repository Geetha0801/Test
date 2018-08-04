package week1.day2;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] studentList = {"Geetha","Poomathi","Sindhu","Rani","Arjun"};
		int[] ageList = {26,27,25,34,39};
		//char[][] gradeList = {{'A','A','A','A','A'},{'B','A','A','A','A'},{'A','A','C','A','A'},
				//{'A','F','A','A','A'},{'F','F','F','F','F'}};		
	     //Scanner src =  new Scanner(System.in);
	     //System.out.println("Enter Student Number");
	     //int whichStudent = src.nextInt();
	     for (String name :studentList)
	     {	
	    	 System.out.println(name);
	    	 System.out.println(name.length());
	    	 
	     }
		  for (int age : ageList)
		  {
			  System.out.println(age);
	    		 
	     }
		}
	}
