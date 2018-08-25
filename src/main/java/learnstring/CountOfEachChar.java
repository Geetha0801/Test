package learnstring;

public class CountOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="Amazon India Private Limited";
		int length = text.length();
		int count =0, i,j;
		String alphabets = "ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int alphalength = alphabets.length();
		for(i=0;i<alphalength-1;i++)
		{
			count=0;
			for(j=0;j<length-1;j++)
			{
				if(alphabets.charAt(i)==text.charAt(j))
				{
					count ++;
				}				
			}
			if(count>0)
			System.out.println("Count of "+alphabets.charAt(i)+" = "+count);
		}
		
		

	}

}
