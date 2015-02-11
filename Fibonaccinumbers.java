
public class Fibonaccinumbers {
	
	public static void main(String[] args){ 
	// finding the sum of the fibonaccinumbers for x <4000000
		long x;
	 
		
		long y =1;
		long next=0;
	
		long evenAdder=0;  
		                                              
		for(x=0;next<4000000; x = next + x) {       
		//	System.out.println(x);                             
		
			next=x+y;                                                    
			y=next; 
			if(x%2==0){
				evenAdder=evenAdder +x;
			}
			if(y%2==0){ 
				evenAdder=evenAdder + y; 
			}
													
			
		}
		System.out.println("The sum of the even-valued terms:" +evenAdder);                  
					                                          
	               
		
	
	}
}