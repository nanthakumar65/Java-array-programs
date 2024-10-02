package arrayPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Create_a_list_from_elements_of_HashMap {

	public static void main(String[] args) {
		
		// Create Map
		Map<Integer,Integer> mp = new HashMap<Integer, Integer>() ;
		mp.put(1, 10);
		mp.put(2, 20);
		mp.put(3, 30);
		
		
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, Integer> > list = new ArrayList<Map.Entry<Integer, Integer> >(mp.entrySet());
		
		for (Entry<Integer, Integer> entry : list) {
			
			System.out.println("key " + entry.getKey() + ": Value " + entry.getValue());
		}
	}
	
	

}
