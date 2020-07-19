package com.java8practise.LambdaExp;

public  class LambdaExpressionsDemo {
    public void evaluateFunctionalInterface () {

        MathOperation addition = (int a, int b) -> a+b;

        evaluate(10,15, addition);
    }

    public void evaluate(int a,int b, MathOperation operation) {
       int x = operation.operate(a, b);
        System.out.println(x);
    }
}


