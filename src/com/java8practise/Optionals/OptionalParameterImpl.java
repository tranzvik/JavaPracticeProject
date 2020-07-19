package com.java8practise.Optionals;

import java.util.Arrays;
import java.util.Optional;

public class OptionalParameterImpl {

    public void optionalParamsExecution() {
        optionalParamMethodImpl1(2, new int[] {1,2,3});
        optionalParamUsingObjectInstance(1,2);
        optionalParamUsingObjectInstance(new int[] {1,3,5});
        optionalParamUsingOptionals(Optional.of(5));
        optionalParamUsingOptionals(Optional.empty());
        optionalParamUsingOptionals(Optional.ofNullable(null));
    }

    /**
     * We could use method overloading
     * Using Var -args of single type
     */
    private void optionalParamMethodImpl1(int arg1, int... arg2) {
        System.out.println("1st Param:" + arg1);
        String message = arg2.length > 1 ? "args present" : "args not present";
        System.out.println(message);
        Arrays.stream(arg2).forEach(x -> System.out.println(x));
    }

    /**
     * Using Var -args of type we are not sure of and check against the same
     */
    private void optionalParamUsingObjectInstance(Object... arg1) {
        if (arg1[0] instanceof int[]) {
            System.out.println("Integer array data is passed");
            // Arrays.stream(arg1).forEach(System.out::println);
        } else if (arg1[0] instanceof String) {
            System.out.println("String array data is passed");
        } else if (arg1[0] instanceof Integer) {
            System.out.println("Integer data is passed:" + arg1[0]);
        }
    }


    /**
     * Using Optionals provided by Java 8
     * */
    private void optionalParamUsingOptionals(Optional<Integer> arg) {
        if (arg.isPresent()) {
            System.out.println("Argument Present:"+ arg.get());
        } else {
            System.out.println("Argument is absent");
        }
    }
}
