package arraylists;

import java.util.ArrayList;

public class Traversal {
    
    public static void traverseWithForLoop(ArrayList<String> stringList) {
        System.out.println("Using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

    public static void traverseWithEnhancedForLoop(ArrayList<String> stringList) {
        System.out.println("\nUsing enhanced for loop:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
