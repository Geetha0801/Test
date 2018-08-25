package pgmquestions;

public class ReverseAString {

	public static void main(String[] args) {
		StringBuilder txt = new StringBuilder("Iam the winner");
		int length = txt.length();
		//char[] array = txt.toCharArray();
		System.out.println(txt.reverse());
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(txt.charAt(i));
		}

	}

}
