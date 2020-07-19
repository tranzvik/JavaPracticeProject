package com.java8practise.PECS.ProducerExtends;

import com.java8practise.PECS.Apple;
import com.java8practise.PECS.Fruits;
import com.java8practise.PECS.Mango;

import java.util.ArrayList;
import java.util.List;

public class ProducerExtendsT {

    /**
     * We may face situations of adding not just an Integer to a list but also sub types and super types and we cannot the same.
     * Widening or Narrowing a reference.
     *<? extends T>  Producer Extends is mainly used to achieve covariance(Narrowing down a reference)
     *
     * Imp Points:
     *          * 1> Use the <? extends T> wildcard if you need to retrieve objects of type T from a collection.
     *          *
     *          * 2>Use the <? super T> wildcard if you want to store Objects of type T in a collection.
     *
     **/


    public void producerDemo() {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(1));
        appleList.add(new Apple(2));

        List<Mango> mangoList = new ArrayList<>();
        mangoList.add(new Mango(1));
        mangoList.add(new Mango(2));


        List<? extends Fruits> fruitBasket = appleList;

        for(Fruits fruit: fruitBasket) {
            System.out.println(fruit.getClass());
        }

        fruitBasket = mangoList;
        for(Fruits fruit: fruitBasket) {
            System.out.println(fruit.getClass());
        }

        //fruitBasket.add(new Apple(3));
        //fruitBasket.add(new Mango(3));
        /** The above 2 lines will never be allowed.
         * <? extends T>  wildcard tells the compiler that we are dealing with a sub-type of Fruits ,
         * but we cannot be sure of which fruit exactly.
         * Since there is no way to tell and we need to guarantee Type-Safety(Invariance) , we wont be allowed to put  anything inside
         * such a structure.
         *
         * On the other hand , since we know that whichever type it might be individually, it will be a sub-type of Fruits
         * we can get data out of the structure with the guarantee that it will be a fruit.
         * **/
    }
}

