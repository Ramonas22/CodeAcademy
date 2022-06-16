package CodeAcademy.Zilvinas.HashSetAndHashMap.examples;

import java.util.HashSet;

class HashSetExample1 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        hashSet.add("Fig");

        System.out.println(hashSet);


        //Since it is same values hashset does not add it
        hashSet.add("Apple");
        hashSet.add("Mango");

        System.out.println(hashSet);
    }
}
