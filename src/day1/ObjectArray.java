package day1;

public class ObjectArray {

	public static void main(String[] args) {
		// To overcome the issue of storing values of similar data type in One D array we use Object array
		
		//Object is a class just like String class ----> is used to store values of different data type
		
		Object ob[]=new Object[6];
		
		ob[0]= "Adyasa";
		ob[1]="07/03/2000";
		ob[2]=25;
		ob[3]="Jharsuguda";
		ob[4]="Odisha";
		ob[5]= 9348385808l;
		
		for(int i=0; i<ob.length;i++) {
			
			System.out.println(ob[i]);
		}
		

	}

}
