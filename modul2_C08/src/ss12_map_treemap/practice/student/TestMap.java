package ss12_map_treemap.practice.student;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(30, "Smith");
        hashMap.put(31, "Anderson");
        hashMap.put(29, "Lewis");
        hashMap.put(33, "Cook");
        System.out.println(hashMap + "\n");

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(30, "Smith");
        linkedHashMap.put(31, "Anderson");
        linkedHashMap.put(29, "Lewis");
        linkedHashMap.put(33, "Cook");

        Set<Integer> integers = linkedHashMap.keySet();
        for (Integer key : integers) {
            System.out.println(linkedHashMap.get(key));
        }
    }
}
