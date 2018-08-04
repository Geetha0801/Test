package week1.day2;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] numberArray = {22,32,42,-22,-9};
		int maxNumber = 0;
		int tempNumber = 0;
		for(int i=0;i < 4; i++)
		{
			 tempNumber = numberArray[i];
			if(tempNumber > numberArray[i+1])
			{
				 maxNumber = tempNumber;
			}
		}
		System.out.println("FOR MaxNumber: "+maxNumber);
	
	
	  for(int number:numberArray)
	  {
		  
			if(tempNumber > number)
			{
				 maxNumber = tempNumber;
			}  
	  }
	  System.out.println("For Each :MaxNumber: "+maxNumber);

}
}
