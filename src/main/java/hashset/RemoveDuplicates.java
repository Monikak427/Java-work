package hashset;
import java.util.LinkedHashSet;

import java.util.LinkedHashSet;

public class RemoveDuplicates{

    public String removeDuplicates(String str) {

        char[] charArray = str.toCharArray();

        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        System.out.println("Adding characters to LinkedHashSet:");
        for (char ch : charArray) {
            System.out.println("Adding character: " + ch);
            boolean added = uniqueChars.add(ch);
            System.out.println("Character added: " + added);
        }

        StringBuilder result = new StringBuilder();

        System.out.println("\nConstructing result string:");
        for (char ch : uniqueChars) {
            System.out.println("Appending character: " + ch);
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();
        String input = "abbacd";
        String output = remover.removeDuplicates(input);
        System.out.println("\nOriginal String: " + input);
        System.out.println("String after removing duplicates: " + output);
    }
}

