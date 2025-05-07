package realTimeExamples;

public class AvgSumOfAges {

	public static void main(String[] args) {
		
		int ages[]= {10,20,30,40,50,50,90};
		
		int length=ages.length;
		
		System.out.println(length);
		
		float avg, sum =0;
		
		for(float age:ages) {
			
			sum+=age;
			
			
		}
		System.out.println(sum);
		
		avg=sum/length;
		
		System.out.println(avg);
		

	}

}
