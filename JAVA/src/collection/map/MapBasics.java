package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBasics {

	public static void main(String[] args) {
		Map<Integer, String> map1= new HashMap<Integer, String>();
		
		//put method insert entry to map
		
		map1.put(1, "yuv");
		map1.put(2, "raj");
		
		//print map order may vary
		System.out.println(map1);		//op: {1=yuv, 2=raj}
		
		//get method
		
		System.out.println(map1.get(2));		//pass key object op: raj
		
		//values method, keyset method
		
		Collection<String> values = map1.values();		//returns a collection
		Set<Integer> keys=map1.keySet();
		System.out.println("keys : "+keys +"\nvalues :" +values);		//order may be different
		
		//check map for key or value
		System.out.println(map1.containsKey(2)+", "+map1.containsValue("yuv"));
		System.out.println(map1.containsKey(3)+", "+map1.containsValue("yash"));
		
		//putIfAbsent Method
		map1.putIfAbsent(2, "yash");
		map1.putIfAbsent(3, "yash");
		
		for(int k:keys)
		{
			System.out.print(k+"="+map1.get(k)+" ");		//printing map using key
		}
		
		//Iterator for map
		//Map not part of Collection so no iterator but you can return entrySet and iterate using that
	}

}

/*
OUTPUT
{1=yuv, 2=raj}
raj
keys : [1, 2]
values :[yuv, raj]
true, true
false, false
1=yuv 2=raj 3=yash 
 */
