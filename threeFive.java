
public class threeFive {
	public static void main(String[] args) { 
		
		long x; 
		long sum=0;
		long sum3=0;
		long sum5=0;
		// the sum of the three three multiples
		for(x=0;x<1000;x=x+15) { 
			if ( x%15==0){
			sum = sum +x;
			}
			
			System.out.println(sum);
		}
		//the sum of the five multiples s
		for(x=0;x<1000;x=x+3) { 
			if (x%3==0){
			sum3 = sum3 +x;
			}
			
			System.out.println(sum3);
		}
		// the sum of the 15 multiples 
		for(x=0;x<1000;x=x+5) { 
			if(x%5==0) { 
				sum5 = sum5 +x;
			}
			
			
			System.out.println(sum5);
		}
	 // subtracting sum because the 15 multiples would occur twice
		System.out.println(sum3+sum5-sum);
		
		
	}
}
