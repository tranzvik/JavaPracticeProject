package com.java8practise.ExceptionHandling;

/**
 * NOTES -
 * 1)Program execution stops wherever system.exit(1) is given.
 * It does not proceed further irrespective of try-catch or finally block.
 *
 * 2)What if exception is thrown in catch block-
 * Program execution stops at the point of exception and navigates to execute finally block and printing exception message.
 * The execution flow does not come out of the try-catch-finally mechanism.
 * So ideally the program flow design should not have code that could cause exceptions in catch block.
 *
 * **/

public class ExceptionChecks {

    protected void methodExceptionTest() {
        System.out.println("Exception Test Method");

        int x = 2;

        try {
            System.out.println("Try Block");
            int y = x / 0;

        } catch (ArithmeticException e) {
            System.out.println("Catch Block ");
            int z = x/0;

            System.out.println("Exception Message::" + e.getMessage());

        }

        finally {
            System.out.println("Finally Block ");
        }
        System.out.println("Outside Try-Catch Block ");
    }
}

