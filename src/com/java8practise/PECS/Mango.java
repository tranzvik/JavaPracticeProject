package com.java8practise.PECS;

public class Mango extends Fruits {

    int serialId;

    public Mango(int id) {
        this.serialId = id;
        System.out.println("Mango Constructor : Sub Type of Fruits" + id);
    }
}
