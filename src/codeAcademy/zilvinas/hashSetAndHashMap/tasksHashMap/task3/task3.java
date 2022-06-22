package codeAcademy.zilvinas.hashSetAndHashMap.tasksHashMap.task3;

import java.util.HashMap;
import java.util.Map;

class task3 {

    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(11, "eleven");
        integerStringHashMap.put(12, "twelve");
        integerStringHashMap.put(100, "hundred");

        HashMap<String , Integer> stringIntegerHashMap = new HashMap<>();

        for (Map.Entry map: integerStringHashMap.entrySet()
             ) {
            stringIntegerHashMap.put(map.getValue().toString(), (Integer) map.getKey());
        }

        printStringIntegerMap(stringIntegerHashMap);

        System.out.println("Keys of String, Integer hashmap are :");
        for (Map.Entry map: stringIntegerHashMap.entrySet()
             ) {
            System.out.println(map.getKey());
        }

    }

    static void printStringIntegerMap(HashMap<String, Integer> map){
        for (Map.Entry temp: map.entrySet()
             ) {
            System.out.println("Key is " + temp.getValue() + ", value is " + temp.getKey());
        }
    }
}
