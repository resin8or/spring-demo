package com.res.spring.basics.springdemo;

public class BinarySearchImpl{

    private SortAlgorithm sortAlgorithm;

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