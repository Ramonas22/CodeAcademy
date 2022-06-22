package codeAcademy.zilvinas.hashSetAndHashMap.examples;


import java.util.HashSet;
import java.util.Iterator;

class HashSetExample2 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Chaitanya");
        hashSet.add("Rahul");
        hashSet.add("Tim");
        hashSet.add("Rick");
        hashSet.add("Harry");

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String temp: hashSet
             ) {
            System.out.println(temp);
        }
    }
}
