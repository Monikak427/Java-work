import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            System.out.print(reversedWord + " ");
        }
    }
}

