package com.java8practise.FunctionalInterfaceTest;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {

    public void expressionFeeder() {

        /**
         * Predicates-
         *
         * */
        List<Integer> list = Arrays.asList(1, 5, 76, 13, 17, 19, 24, 56, 59);

        Predicate<Integer> p1 = t -> t % 2 == 0;

        evaluateExpresion(list, p1);
    }

    public void evaluateExpresion(List<Integer> list, Predicate predicate) {
        list.forEach(num -> {
            if (predicate.test(num)) {
                System.out.println("Even numbers are :" + num);
            }
        });

    }
}
