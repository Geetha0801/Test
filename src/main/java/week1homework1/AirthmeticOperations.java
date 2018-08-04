package week1homework1;

public class AirthmeticOperations {
	
	int numberOne = 22;
	int numberTwo = 24;
	
	public void addition()
	{
		System.out.println("Addition:"+ (numberOne + numberTwo));
	}
	
	public int substract()
	{
		System.out.println("Substraction:"+ (numberOne - numberTwo));
		return (numberOne - numberTwo);
	}
	
	public int multiply()
	{
		System.out.println("Mulitiplication:"+ (numberOne * numberTwo));
		return (numberOne * numberTwo);
	}
	
	public void multiplyNumberByTwo()
	{
		System.out.println("multiplyNumberByTwo:"+ (numberTwo*2));		
	}
	public int divideNumberTwoBy(int divident)
	{
		System.out.println("divideNumberByTwo:"+ (numberTwo/divident));	
		return (numberTwo/divident);
	}
	
	
	
}
