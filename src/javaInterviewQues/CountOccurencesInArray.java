package javaInterviewQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccurencesInArray {

	public static void main(String[] args) {
	
		//Using HashMap:
		
		int arrNum[]= {10,10,20,30,40,20,50,50,60,60,60,60};
		
		Map<Integer,Integer> storeMap=new HashMap<>();
		
		for(int arr:arrNum) {
			
			if(storeMap.containsKey(arr)) {
				
				storeMap.put(arr, storeMap.get(arr) + 1);
			}else {
				
				storeMap.put(arr, 1);
			}
			
		}
		//1st way of printing the key (elements) and value(Frequency)
		Set<Entry<Integer,Integer>> entrySet=storeMap.entrySet();
		
		for(Entry<Integer,Integer> entry :entrySet) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("**********************************************************************************");
		
		//2nd way of printing the key (elements) and value(Frequency)
		for(Map.Entry<Integer, Integer> ent:storeMap.entrySet()) {
			
			System.out.println( ent.getKey() + " : " +ent.getValue());
		}
	}
}
