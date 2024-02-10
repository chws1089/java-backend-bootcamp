package io.javabrains.javacollections.comparator.sets;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Collection<Double> doubles = new HashSet<>(20,0.8f);

        for (int i =0; i<10;i++)
            doubles.add(100 * Math.random());

        for (Double num : doubles)
            System.out.println(num);

        List<Double> arrayList = new ArrayList<>(doubles);
        Collections.sort(arrayList);
//
//        for (int i=0; i<arrayList.size();i++)
//            System.out.println("index:"+ i+" is "+arrayList.get(i));

        System.out.println();

//        LinkedHashSet<Double> doubles1 = new LinkedHashSet<>(doubles);
//
//        for (Double num : doubles1)
//            System.out.println(num);

        SortedSet<Double> sortedSet = new TreeSet<>(doubles);

        for (Double num: sortedSet)
              System.out.println(num);

        System.out.println(sortedSet.last() - sortedSet.first());


    }
}
