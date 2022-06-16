package CodeAcademy.Zilvinas.HashSetAndHashMap.tasksHashSet.task1;

import java.util.HashSet;

class Task1 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        System.out.println(hashSet + " hashset size is " + hashSet.size());

        hashSet.add("Element1");

        System.out.println(hashSet + " hashset size is " + hashSet.size());

        System.out.println("is Element1 inside hashset ? " + hashSet.contains("Element1"));

        hashSet.remove("Element1");

        System.out.println("Element1 removed from hashset");

        System.out.println(hashSet + " hashset size is " + hashSet.size());

        hashSet.clear();

        System.out.println(hashSet + " hashset size is " + hashSet.size());

    }
}
