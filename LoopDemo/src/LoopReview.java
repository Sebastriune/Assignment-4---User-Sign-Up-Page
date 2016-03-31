
public class LoopReview {

	public static void main(String[] args) {
		System.out.println("The first 100 odd numbers are");
		for (int i = 1; i < 200; i += 2) {
				System.out.println(i);
		}
		System.out.println("\nThe first 100 even numbers are");
		int k = 2;
		do {
			System.out.println(k);
			k += 2;
		} while (k <= 200);
		
		System.out.println("\nThe diamond shape");
		int m = 1;
		while (m < 4) {
	    	int j = 0;
	    	while (j < 5 - m / 2) {
	    		j++;
	    		System.out.print(" ");
	    	}
	        j = 0;
	        while (j < m) {
	        	j++;
	        	System.out.print("*");
	        }
	        System.out.print("\n");
	        m += 2;
	      }
	    
	      int i = 7;
	      while (i > 0) {
	      i -= 2;
	    	int j = 0;
	    	while (j < 5 - i / 2) {
	    		j++;
	    		System.out.print(" ");
	    	}
	        j = 0;
	        while (j < i) {
	        	j++;
	        	System.out.print("*");
	        }
	        System.out.print("\n");
	      }
	}
}

	

