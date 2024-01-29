package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Iteration {

    public static void main(String[] args) {
    	
        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("Ab");
        stringSet.add("Abc");
        stringSet.add("Abcd");
        stringSet.add("Abcde");
        stringSet.add("Abcdef");
        stringSet.add("Abcdefg");
        stringSet.add("Abcdefgh");
        stringSet.add("Abcdefghi");
        stringSet.add("Abcdefghij");
        stringSet.add("Abcdefghijk");

        System.out.println("Iterating over HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating over HashSet using for loop:");
        Object[] array = stringSet.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nIterating over HashSet using enhanced for loop:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}



