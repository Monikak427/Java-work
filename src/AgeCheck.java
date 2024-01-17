import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = s.nextInt();
		if(age < 19 && age >13) {
			System.out.println("Person is a teen");
		} else if(age<13) {
			System.out.println("Person is a kid");
		} else {
			System.out.println("Person is an adult");
		}
	}

}

