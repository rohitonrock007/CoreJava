package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1,"Ritu");
		map1.put(2,"Rohit");
		map1.put(3,"Sachin");
		map1.put(4,"Dhruv");
		map1.put(5,"Hardik");
		
		System.out.println(map1);
		System.out.println(map1.get(3));
		
		for(Map.Entry<Integer, String>entry1: map1.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
	for(Integer val: map1.keySet() ) {
			
			System.out.println("Key is " + val);
			System.out.println("Value is " + map1.get(val));
		}
		
		for(String val : map1.values()) {
			
			System.out.println("Value is " + val);
		}
		
	//update the data
		
//		map1.put(4, "John");
//		
//		System.out.println(map1);
//		
//		//delete the entry
//		map1.remove(5);
//		System.out.println(map1);
		
		//===============
//LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();// print which have write not follow order
//		
//		map2.put(2,"Ritu");
//		map2.put(4,"Rohit");
//		map2.put(1,"Sachin");
//		map2.put(3,"Dhruv");
//		map2.put(5,"Hardik");
//		
//		System.out.println(map2);
//		
//		//======================
//TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
//		
//		map3.put(4,"Ritu");
//		map3.put(3,"Rohit");
//		map3.put(2,"Sachin");
//		map3.put(5,"Dhruv");
//		map3.put(1,"Hardik");
//		
//		System.out.println(map3);
	
	}

}
