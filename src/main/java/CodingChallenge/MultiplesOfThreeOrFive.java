package CodingChallenge;

public class MultiplesOfThreeOrFive {

	public static void main(String[] args) {
		// Declare the sum
		int sum =0;
		// loop to iterate less than 100
		for (int i=1;i<100;i++)
		{
			// multiples of 3 or 5
			if((i%3==0)||(i%5==0))
			{
				//adding the multiples
				sum = sum+i;
			}
		}
		//printing the results
		System.out.println("Sum "+sum);

	}

}
