package com.res.junit;

public class MathExamples {

    int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers){
            sum +=i;
        }
        System.out.println("sum = " + sum);
        return sum;

    }

}
