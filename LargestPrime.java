
public class LargestPrime {
	public static void main(String[] args) { 
		 

		
		long num = 600851475143L ;
		for (long  i = num; i >= 2; i--) {
            boolean isPrime = true;
            for (int j = 2; j < i-1; j++) { //increment "j" not "i"
                if (i % j == 0) {   //assuming j is multiples of i
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
            	if ( num%i==0 ) {
            		System.out.println(i);
            	}
            	}
        }
	
	/* This is a more efficient alogithm provided by one of the nice and kind CS TAs 
		int i=2; 
	long h = 600851475143L;
	while (i*i<h){ 
		while (h%i==0){ 
			h/=i;
			
		}i++;
	}
	System.out.println(i); */
		}
	
	} 
