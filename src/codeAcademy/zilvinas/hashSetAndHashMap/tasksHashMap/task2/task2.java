package codeAcademy.zilvinas.hashSetAndHashMap.tasksHashMap.task2;

import java.util.HashMap;
import java.util.Map;

class task2 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(11, "eleven");
        hashMap.put(12, "twelve");
        hashMap.put(100, "hundred");

        System.out.println("\nOriginal hashMap");
        printMap(hashMap);

        hashMap.remove(11);

        System.out.println("\nHashMap after 11 is removed");
        printMap(hashMap);

        hashMap.clear();

        System.out.println("\nCleared hashmap");
        printMap(hashMap);

    }

    static void printMap(HashMap<Integer , String> map){
        for (Map.Entry mapEntry : map.entrySet()
        ) {
            System.out.println("Key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());
        }
    }
}
