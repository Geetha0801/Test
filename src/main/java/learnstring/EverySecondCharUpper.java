package learnstring;

public class EverySecondCharUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer text = new StringBuffer("amazon");
        int length = text.length();
        for(int i=0;i<length;i++)
        {      	
        
        	if(i%2!=0)
        	{
        	  System.out.print((char)(text.charAt(i)-32));
            }
        	else
        	{
        	System.out.print(text.charAt(i));
        	}
        	
	}

	}
}
