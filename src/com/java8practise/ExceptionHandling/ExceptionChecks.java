package com.java8practise.ExceptionHandling;

import java.io.IOException;

/**
 * NOTES -
 * 1)Program execution does not stop whenever system.exit(1) is given in try/catch or finally block after the step of exception,
 * it goes on to execute catch and finally provided system.exit is after the x/0 step
 *
 *
 * 2)What if exception is thrown in catch block-
 * Program execution stops at the point of exception and navigates to execute finally block and printing exception message.
 * The execution flow does not come out of the try-catch-finally mechanism.
 * So ideally the program flow design should not have code that could cause exceptions in catch block.
 *
 * **/

public class ExceptionChecks  {

    public void methodExceptionTest()  {
        System.out.println("Exception Test Method");

        int x = 2;

        try {

            System.out.println("Try Block");

            int y = x / 0;

            System.exit(1);
            System.out.println("after try");


        } catch (ArithmeticException e) {

            System.out.println("Catch Block ");

            System.out.println("After exit catch ");

            //int z = x/0;

            //System.out.println("Exception Message::" + e.getMessage());

        }

        finally {

            System.out.println("Finally Block ");
            System.exit(1);
            System.out.println("After exit finally ");
        }
        System.out.println("Outside Try-Catch Block ");
    }
}

