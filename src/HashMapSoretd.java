/**
 * 
   Author  : JayaKrishna
   Date    : 05/11/2020
   Desc    : HashMapSoretd.
 *
 **/

import java.util.*;

public class HashMapSoretd {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "JK");
		hashMap.put(2, "Akhil");
		hashMap.put(3, "Sasank");
		hashMap.put(4, "Kiran");
		List<String> sortedHashMap=new ArrayList<String>();
		sortedHashMap=getValues(hashMap);
		System.out.println(sortedHashMap);
		
		
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);
		
		return sortedHashMap;
	}

}