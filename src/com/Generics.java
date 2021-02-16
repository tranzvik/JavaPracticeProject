package com;

public class Generics {


    public void operate() {

        Integer [] a = {1,6,7,8};
        generateOutput(a);
    }

    public  < E > void generateOutput(E[] input) {

        for(E element: input) {
System.out.println(element);
        }
    }
}
