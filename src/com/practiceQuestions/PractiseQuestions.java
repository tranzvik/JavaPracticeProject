package com.practiceQuestions;


import java.io.Console;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.stream.Collectors;

public class PractiseQuestions {

    public void solveQuestions() {
        //solveQuestion1();
        solveQuestion2();
    }

    private void solveQuestion1() {
        /**
         * Given 3 arrays, write a logic to find Intersection of 3.
         * --We could sort elements of each array and compare equality.
         * */
        List<Integer> arr1 = Arrays.asList(1, 3, 5, 13, 15, 17);
        List<Integer> arr2 = Arrays.asList(4, 6, 9, 11, 5, 19);
        List<Integer> arr3 = Arrays.asList(41, 6, 8, 12, 5, 15);
        List<Integer> temp = new ArrayList<>();

        HashSet<Integer> h1 = new HashSet<Integer>(arr1);
        /*for (int i = 0; i < arr1.size(); i++) {
         if(!h1.add(arr2.get(i)))  {
             temp.add(arr2.get(i));
            }
        }
        h1 = new HashSet<>(arr3);
        for (int i = 0; i < temp.size(); i++) {
            if(!h1.add(temp.get(i))) {
                System.out.println(temp.get(i));
            }
        }*/

        //Method2
        Object x[] = h1.toArray();

        for (int i = 0; i < arr2.size(); i++) {
            if (Collections.frequency(arr2, (int) x[i]) > 0 && Collections.frequency(arr3, (int) x[i]) > 0) {
                System.out.println((int) x[i]);
            }
        }
    }

    private void solveQuestion2() {
        /**
         * Given an array of elements and a number k, find all pairs whose sum equals number k.
         * **/
        int pairSum = 15;
        List<Integer> list = Arrays.asList(1, 8, 3, 11, 7, 9, 4, 19, 14);
        Map<Integer, Integer> reultMap = list.stream().collect(Collectors.toMap(p -> p, p -> 15 - p));

        reultMap.entrySet().forEach(pair-> {
            if(list.contains(pair.getValue())) {
                System.out.println(pair);
            }
        });

    }

    private void solveQuestion3() {
        /**
         * Given an array, find the subset of the array that generates the largest sequence.
         * **/

        List<Integer> mainList = Arrays.asList();
    }

}
