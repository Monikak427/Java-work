package arraylists;

import java.util.ArrayList;

public class ArrayListToArray {

    public static String[] convertArrayListToArray(ArrayList<String> stringList) {
        // Convert ArrayList to Array
        String[] stringArray = new String[stringList.size()];
        return stringList.toArray(stringArray);
    }
}

