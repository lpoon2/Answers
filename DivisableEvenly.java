
public class DivisableEvenly {
	public static void main(String[] args) {
	int product;	
	char product1;
	for (int x =100 ; x>=100 ; x++){
		for ( int y=100; y>=100 ; y++){
			product = x*y;
			System.out.println(product);
			
		}
	
	}
	char first = product.intAt(0);
	char last = product.intAt(product.length()-1);
		
	if (first==last){ 
		System.out.println(product);
	}

	}
}
