package logical;

import java.util.*;

//Practice of Hashmap
public class ExHashMap {
	
public static void main(String[] args) {
	Map<String,String> myMap  = new HashMap<String,String>();
	
	LinkedHashMap<Integer,String> linkedhashMap = new LinkedHashMap<>();
	
	
	myMap.put("J", "Java");
	myMap.put("H","Hibernate");
	myMap.put("A", "Angular");
//iterating through for loop
	for(Map.Entry<String, String> set : myMap.entrySet()) {
		System.out.println(set.getKey() + " = " + set.getValue());
	}
	
	//using forEach loop with arrow function
	myMap.forEach(
			(key,value)
		    -> System.out.println(key + "=" + value));
	
	//using iterator
	Iterator<java.util.Map.Entry<String, String>> new_iterator = myMap.entrySet().iterator();
	
	while(new_iterator.hasNext()) {
		Map.Entry<String,String> new_map = (Map.Entry<String, String>)new_iterator.next();
		
		System.out.println(new_map.getKey() + "  =  " + new_map.getValue());
	}
}
}
