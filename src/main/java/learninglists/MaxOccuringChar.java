package learninglists;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String name = "Amazon india";
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
				if(count>=maxCount)
				   {
					   maxCount = count;
					   maxOccur.put(name.charAt(i), count);
				   }
			}
		

	}
		System.out.println(maxOccur);
		int temp = 0;
		char key =' ';
		for(Entry<Character,Integer> each:maxOccur.entrySet())
		{
			if(each.getValue()>temp)
			{
				temp=each.getValue();
				key = each.getKey();
			}
		}
          System.out.println(key+ "-->" +temp);
}
}
