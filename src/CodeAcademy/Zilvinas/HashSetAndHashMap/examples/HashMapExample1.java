package CodeAcademy.Zilvinas.HashSetAndHashMap.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Tony");
        hashMap.put(2, "Jack");
        hashMap.put(3, "Liza");
        hashMap.put(4, "Jessica");

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.keySet());

        //Iterating with Iterator and while loop
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println("Key is " + mapEntry.getKey() + " and its value is " + mapEntry.getValue());
        }

        //Enchanted for loop
        for (Map.Entry mapEntry : hashMap.entrySet()
             ) {
            System.out.println("Key is " + mapEntry.getKey() + " and its value is " + mapEntry.getValue());
        }

        //Hashmap size
        System.out.println(hashMap.size());

        //Remove command in hashmap
        hashMap.remove(1);
        System.out.println(hashMap.entrySet());


    }
}
