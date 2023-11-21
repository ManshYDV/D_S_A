package Hashing.Basic;

import java.util.HashMap;
import java.util.Map;

public class CharHashing {

    private static void cHash(String name) {
        Map<Character, Integer> HMap = new HashMap<>();
        char[] strMap = name.toCharArray();
        for (char c : strMap) {
            if (HMap.containsKey(c)) {
                HMap.put(c, HMap.get(c) + 1);
            } else {
                HMap.put(c, 1);
            }
        }
        System.out.println(HMap);
    }

    public static void main(String[] args) {
        String name = "yadav Manish";
        cHash(name);
    }
}
