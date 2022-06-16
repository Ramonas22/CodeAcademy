package CodeAcademy.Zilvinas.HashSetAndHashMap.tasksHashMap.task1;

import java.util.HashMap;
import java.util.Map;

class task1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(11, "eleven");
        hashMap.put(12, "twelve");
        hashMap.put(100, "hundred");

        System.out.println(hashMap.entrySet());

        System.out.println("Does hashmap contains key 11 " + hashMap.containsKey(11)
                + ", does hashmap contains value thirteen" + hashMap.containsValue("thirteen"));

        System.out.println(hashMap.get(100));

        for (Map.Entry mapEntry : hashMap.entrySet()
        ) {
            System.out.println("Key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());
        }
    }
}
