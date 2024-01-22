import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
            return;
        }

        String concatenated = str1 + str1;
        boolean isRotation = concatenated.contains(str2);
        System.out.println("Is the second string a rotation of the first string? " + isRotation);
    }
}

