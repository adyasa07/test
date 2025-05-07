package javaInterviewQues;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String[] names={"Java", "Python", "Ruby" ,"PHP","Javascript", "Java"};
		
		//1.Comparing each element----> Time Complexity----> O(n^2)-----> worst solution
		
		for(int i=0; i<names.length;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equals(names[j])){
					
					//System.out.println("Duplicate name is : " +names[i]);
					
				}
			}
		}
		
		
		//2.Using HashSet---> Java Collection----> It stores unique values
		
		Set<String> store=new HashSet<>();
		
		for(String name:names) {
			
			if(store.add(name)==false) {
				
				System.out.println("Duplicate name is : " + name);
			}
		}
		
	}

}
