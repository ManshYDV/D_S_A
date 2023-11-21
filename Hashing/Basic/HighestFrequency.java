package Hashing.Basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestFrequency {
    private static int HighFrequency;
    private static int LowFrequency;

    private static void HighestF(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        HighFrequency = (Collections.max(map.values()));
        LowFrequency = (Collections.min(map.values()));

        for (Map.Entry<Integer, Integer> max : map.entrySet()) {
            if (max.getValue() == HighFrequency) {
                System.out.println(max.getKey() + " " + max.getValue());
            }
            if (max.getValue() == LowFrequency) {
                System.out.println(max.getKey() + " " + max.getValue());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 5 };
        HighestF(arr);
    }
}
