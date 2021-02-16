package com.practiceQuestions;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.Console;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PractiseQuestions {

    public void solveQuestions() {
       // solveQuestion5();
      //  solveQuestion3();

        solveTest();

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
        * Find count of each element in an array
        * */

        List<Integer> x1 = Arrays.asList(22,35,44,1, 4, 6,22, 44,1,22);
        HashSet<Integer> hs = new HashSet<>(x1);
        /*for(int x: hs) {
            System.out.println("element:"+ x+ "-Count:"+ Collections.frequency(x1, x));
        }*/

       //System.out.println(Collections.max(x1));

       /*Map<Integer,Long> map1 = x1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);*/

       long z= x1.stream().collect(Collectors.summingInt(p-> new Integer(p)));

       //int  z = x1.stream().max(Comparator.comparingInt(Integer::intValue)).get();
      // x1.stream().


     //  x1.stream().filter(elem-> elem%2==0).collect(Collectors.toList()).stream().forEach(System.out::println);

      System.out.println(z);
    }

    private void solveQuestion4() {
        /**
         * Given an array, find the subset of the array that generates the largest sequence.
         * **/
    }

    private void solveQuestion5() {

       /* i/p list - "abc", "cab", "bcd", "bcde", "bc", "bac", "cba", "adc", "dac", "cb", "bac", "abcd"
                 matching word - "abc"
                o/p - abc, bac, cab, cba */

      // char x[] = {'d','m', 'a', 'c'};
       //Arrays.sort(x);
      // System.out.println(x);

       String input[] = { "abc", "cab", "bcd", "bcde", "bc", "bac", "cba", "adc", "dac", "cb", "bac", "abcd"};

       List<String> sortedElements = Arrays.asList(input).stream().map(item -> {
        //Arrays.sort(item.toCharArray());
           char s [] = item.toCharArray();
           Arrays.sort(s);
           return String.valueOf(s);
       }).collect(Collectors.toList());

       //sortedElements.forEach(x-> System.out.println(x));
       Predicate<String> predicate = t-> t.contains("abc");

        for(int i=0; i<sortedElements.size();i++){
            if(sortedElements.get(i).equals("abc")) {
                System.out.println(Arrays.asList(input).get(i));
            }
        }

    }

//Question 1  shift 0's and 1s and 2 --use 3 indices (two at the start , 1 at the end)
    public void solvequestion6() {
        List<Integer> list1= Arrays.asList(0,1,2,0,1,2);
        List<Integer> list2 = new ArrayList<>();
        int counter0=0;
        int counter1=0;
        int counter2=0;
        for (int i=0; i<list1.size();i++){

            switch (list1.get(i)) {
                case 0 : counter0++;
                break;
                case 1: counter1++;
                break;
                case 2: counter2++;
                break;
            }
        }

        int i = 0;


        while (counter0 > 0) {
            list2.add(0);
            counter0--;
        }


        while (counter1 > 0) {
           list2.add(1);
           counter1--;
        }


        while (counter2 > 0) {
            list2.add(2);
            counter2--;
        }

        list2.stream().forEach(System.out::println);


    }


    //Question 2
    // O(n)

    public void nextQuestion () {
        //longest subseq in both strings
        //s1= abcde  s2= bdgek   //op bde
        String s1 ="abcde";
        String s2 = "bdge";

        List<String> ls1 = Arrays.asList("a","b","c","d","e");
        List<String> ls2 = Arrays.asList("b","d","g","e");
        List<String> output = new ArrayList<>();

        ls1.sort((x1,x2)->x1.compareTo(x2));
        ls2.sort((x1,x2)->x1.compareTo(x2));

        //adding 1st sorted array to hashset then push all the duplicated to an output array as in to say its in the second array
        HashSet<String> hs1 = new HashSet<String>(ls1);
        for(int i=0;i<ls2.size();i++) {
            if(!hs1.add(ls2.get(i))){
                output.add(ls2.get(i));
            }
        }

        System.out.println(output);

    }

    /*public  int binaryTree () {

        //height of a binary tree
        int maxHeight =0;
        int currentHeight = 0;

        Queue<Node> q1 = new Queue<Node>();

        q1.add(rootNode);

        while(q1.poll()!=null) {

            if (Node == null) {
                maxHeight = -1; //if null height will be added as 1 making it 0
            }

            if (node.left != null) {
                //keep traversing down and push nodes to queue
                currentHeight++;
                q1.add(node.left);
            }

            if(node.right! = null) {
                //keep traversing down and push nodes to queue from right childs as well.Always left will be pushed and
                //poped first so right part of the tree will be traversed only after left subtree is completed.
                currentHeight++;
                q1.add(node.right);
            }

            if(currentHeight > maxHeight) {
                maxHeight=currentHeight;
            }

        }
        return maxHeight+1;

    }


    //Order of the function
    //O(logn)

public void reverseCardDecks() {

} */

    public void solveTest() {
        String s = "torres";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

    }

}
