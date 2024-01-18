import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = s.nextInt();
		terms(N);
	}
	
	private static void terms(int N) {
		int first = 0, second = 1;
		for(int i = 0;i < N;i++) {
			System.out.println(first+ " ");
			int sum = first + second;
			first = second;
			second = sum;
		}
	}
		
}
