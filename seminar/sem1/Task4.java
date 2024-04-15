// ˜˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜ checkArray(Integer[] arr), 
// ˜˜˜˜˜˜˜˜˜˜˜ ˜ ˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜.
// ˜˜˜˜˜ ˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜ ˜˜ ˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜ ˜ ˜˜˜˜˜˜˜˜˜ ˜˜˜ ˜˜ ˜˜ ˜˜˜˜˜ null. 
// ˜˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜:
// 1. ˜˜˜˜ ˜ ˜˜˜˜˜-˜˜ ˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜˜˜ null, ˜˜ ˜˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜˜˜˜˜˜ ˜˜ ˜˜˜˜ ˜˜˜˜˜˜˜˜˜˜˜˜
// 2. ˜˜˜˜ null˜˜ ˜˜˜˜˜˜˜˜˜˜˜ ˜ ˜˜˜˜˜˜˜˜˜˜ ˜˜˜˜˜˜˜, ˜˜ ˜˜˜˜˜˜˜˜ ˜˜˜˜ ˜˜ ˜˜˜ ˜˜ ˜˜˜˜˜˜˜˜˜˜˜˜

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(checkArray(new Integer[] { null, 3, null, 4, 78, null}));
    }

    public static List<Integer> checkArray(Integer [] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null) result.add(i);
        }
        if(!result.isEmpty()) System.out.println("Null by indexes: " + result);
        return result;
    }
}
