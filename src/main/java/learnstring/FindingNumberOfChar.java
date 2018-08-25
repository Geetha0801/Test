package learnstring;

public class FindingNumberOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name = "Poomathi";
       int length = name.length();
       int count = 0;
       for(int i=0;i<length;i++)
       {
    	   if(name.charAt(i)== 'o') 
    	   {
    		   count++;
    	   }
       }
       System.out.println("Number of o is "+count);
	}

}
