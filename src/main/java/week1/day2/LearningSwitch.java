
package week1.day2;
import java.util.*;
public class LearningSwitch {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
	    System.out.println("Enter the test case Value");
	    String testValue = src.nextLine();
	    //char temp = testValue;
	    switch(testValue)
	    {
	    case "Blocked":
	    	System.out.println("Testcase is blocked");
	    	 break;
	    case "Passed":
	    	 System.out.println("Testcase is passed");	 
	         break;
	    case "Failed":
	    	 System.out.println("Testcase is failed");	 
	         break; 
	    case "Invalid":
	    	 System.out.println("Testcase is invalid");	 
	         break;     
	     default:
	    	  System.out.println("Better luck next time");
	    }
	    
	    	 

	}

}
