package learninglists;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfEachCharUsingMap {

	public static void main(String[] args) {
		String name = "Amazon India Private Limited";
		int length = name.length();
		int count = 0,maxCount =0;
		Map<Character,Integer> maxOccur = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<length;i++)
		{
			count = 0;
			for(int j=0;j<length;j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count ++;
				}
				maxOccur.put(name.charAt(i), count);
			}
		

	}

		System.out.println(maxOccur);
	}

}
