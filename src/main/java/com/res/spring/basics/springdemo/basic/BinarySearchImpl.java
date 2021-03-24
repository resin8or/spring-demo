package com.res.spring.basics.springdemo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl{

//    @Autowired
//    private SortAlgorithm sortAlgorithm; // BImpl depends on SortAlgorithm

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm bubbleSortAlgorithm;

    public int  binarySearch(int[] numbers, int numbertoSearchFor){

        // sorting an array
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println("Algorithm: " + bubbleSortAlgorithm);
        return 3;

        // search the array
    }

    // return the result
    

}