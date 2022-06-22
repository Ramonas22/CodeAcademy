package codeAcademy.zilvinas.hashSetAndHashMap.tasksHashSet.task2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class Task2 {

    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();

        integerHashSet.add(4);
        integerHashSet.add(8);
        integerHashSet.add(7);
        integerHashSet.add(1);
        integerHashSet.add(10);

        findHighestNum(integerHashSet);
        findLowestNum(integerHashSet);

    }

    static void findHighestNum(HashSet<Integer> integers){

        //Integer hashSetMax = integers.iterator().next();
        Integer max = integers.stream().findFirst().get();
        Integer temp;
        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()){
            temp = iterator.next();
            if(temp > max){
                max = temp;
            }
        }
        Integer streamMax = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Stream max " + streamMax);

        System.out.println("Highest number in set is " + max);
    }

    static void findLowestNum(HashSet<Integer> integers){
        Integer min = integers.stream().findFirst().get();
        for (Integer integer: integers
             ) {
            if(min > integer){
                min = integer;
            }
        }
        System.out.println("Lowest number in set is " + min);
    }
}
