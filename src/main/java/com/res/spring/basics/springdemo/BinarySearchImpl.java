package com.res.spring.basics.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{

    @Autowired
    private SortAlgorithm sortAlgorithm; // BImpl depends on SortAlgorithm

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int  binarySearch(int[] numbers, int numbertoSearchFor){

        // sorting an array
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println("Algorithm: " + sortAlgorithm);
        return 3;

        // search the array
    }

    // return the result
    

}