package learninglists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaxPrice {

	public static void main(String[] args) {
		List<Integer> bagPrice = new ArrayList<Integer>();
		bagPrice.add(999);
		bagPrice.add(666);
		bagPrice.add(545);
		bagPrice.add(645);
		bagPrice.add(666);
		bagPrice.add(999);
		bagPrice.add(666);
		bagPrice.add(545);
		bagPrice.add(545);
		Collections.sort(bagPrice);
		int size = bagPrice.size();
		Map<Integer,Integer> maxOccur = new TreeMap<Integer,Integer>();
		int count = 1,maxCount = 1;
		System.out.println("Max Price in the list is "+bagPrice.get(size-1));
		for (int i=0;i<size;i++) {
			count =1;
			for(int j=0;j<size;j++)
			{
			   if((bagPrice.get(i).equals(bagPrice.get(j)))&&(i!=j))
			   {
				   count ++;
			   }			   
			   if(count>=maxCount)
			   {
				   maxCount = count;
				   maxOccur.put(bagPrice.get(i), count);
			   }
			   
			   //System.out.println(maxOccur);
		}
		}
			
			System.out.println("Count Of Max repeated price "+maxCount);
			
			int lastKey =0;
			for(Entry<Integer,Integer> each:maxOccur.entrySet())
			{
				lastKey = each.getKey();
			}
			System.out.println("Maximum repeated Price is "+lastKey);
	

}
}
