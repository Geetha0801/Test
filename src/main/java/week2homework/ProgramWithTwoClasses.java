package week2homework;

public class ProgramWithTwoClasses {

	public static void main(String[] args) {
		 //Dummy dummyObj = new Dummy();
		 //int b=dummyObj.addition();
		Dummy.addition();

	}
 
	public static class Dummy{
		public  static int a=89;
		public static int  addition()
		{
			System.out.println(a);
			return a;
		}
		
	}
}
