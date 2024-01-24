package arraylists;

import java.util.ArrayList;

public class RemoveLastObject {

    public static void removeLastObject(ArrayList<String> stringList) {
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
        }
    }
}
