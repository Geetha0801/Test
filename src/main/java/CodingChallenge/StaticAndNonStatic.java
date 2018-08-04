package CodingChallenge;

public class StaticAndNonStatic {
	
	static String s1="Hello";
	String s2="World";
	
	public static void methodStatic()
	{
		System.out.println(s1);
		//System.out.println(s2);
	}
	
	public  void methodNonStatic()
	{
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		 StaticAndNonStatic st = new StaticAndNonStatic();
         st.methodNonStatic();	     
	    		methodStatic();
	    		System.out.println(st.s2);	        

	}

}
