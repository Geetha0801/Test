package week1homework1;

public class PrimeNumber {

	public static void main(String[] args) {
		int givenNumber = 24;
		int primeFlag = 0;
		int divident = givenNumber/2;
		//System.out.println(givenNumber%2);
		for (int i=2;i<=divident;i++)
		{
			if((givenNumber%i)== 0)
			{
				System.out.println(givenNumber+" is not prime");
				primeFlag = 1;
				break;
			}
				
		}
		if(primeFlag == 0)
		{
			System.out.println(givenNumber+" is  prime");
		}
		if((givenNumber%2)==0)
			
		{
			 System.out.println(givenNumber+" is  even");
			 
		}
		else
		{
			System.out.println(givenNumber+" is  odd");
		}

	}

}
