package week1homework1;

public class AccessingAirthmeticOperations {

	public static void main(String[] args) {
		AirthmeticOperations aoOb = new AirthmeticOperations();
		aoOb.addition();
		int subMain = aoOb.substract();
		System.out.println("Mainsubstraction:"+subMain);
		int mulMain = aoOb.multiply();
		System.out.println("MainMulitply:"+mulMain);
		aoOb.multiplyNumberByTwo();
		int divMain = aoOb.divideNumberTwoBy(2);
		System.out.println("MainDivident:"+divMain);
	}

}