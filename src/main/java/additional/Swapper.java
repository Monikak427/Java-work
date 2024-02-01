package additional;

public class Swapper {
	 public static void swapVariables(int a, int b) {
	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
}



   
