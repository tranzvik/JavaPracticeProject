package com.java8practise.PECS.ConsumerSuper;

import com.java8practise.PECS.Apple;
import com.java8practise.PECS.AsianApple;

import java.util.ArrayList;
import java.util.List;

public class ConsumerSuperT {

    public void consumerDemo() {

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(1));
        appleList.add(new Apple(2));


        List<? super Apple> fruitBasket = appleList;

        fruitBasket.forEach((Object x)-> {
            System.out.println(x);
        });

        fruitBasket.add(new AsianApple(5)); //Successful
        fruitBasket.add(new Apple(6));  //Successful

        //fruitBasket.add(new Fruits());    //Compile time error as it accepts only object with Apple as super-type.

        fruitBasket.forEach((Object x)-> {
            System.out.println(x);
        });
        /**
         * fruitbasket is a reference to a list of something that has supertype as Apple.
         * We know that Apple and any of its sub-types can be added without any problem.
         * This is also called Contra-Variance as we are trying to widen the reference.
         *
         * We can use <? super T> only for storing as the retrieval will be done as Object Instances and we cannot know which subType
         * of Apple is present in the list.
         *
         * Imp Points:
         * 1> Use the <? extends T> wildcard if you need to retrieve objects of type T from a collection.
         *
         * 2>Use the <? super T> wildcard if you want to store Objects of type T in a collection.
         *
         *
         *
         * **/

    }

}



