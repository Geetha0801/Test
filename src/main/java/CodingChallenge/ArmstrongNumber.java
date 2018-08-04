package CodingChallenge;

public class ArmstrongNumber {	

	public static void main(String[] args) {
		int divident = 0;
		double resultNumber = 0;
		for( int i=100; i<1000; i++)
		{
			int numberCalc = i;
			do
			{	
			divident = numberCalc%10;
			resultNumber = resultNumber + Math.pow(divident, 3);
			numberCalc = numberCalc/10;
			//System.out.println(resultNumber);
			}while(numberCalc != 0);
			
		
			if(resultNumber == i) 
			{
				System.out.println(i);
			}
			resultNumber = 0;
		}
	}

}
