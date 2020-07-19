package com.java8practise.PECS;

public class Apple extends Fruits {

    int serialId;

    public Apple(int id) {
        this.serialId = id;
        System.out.println("Apple Constructor : Sub Type of Fruits:" + id);
    }
}
