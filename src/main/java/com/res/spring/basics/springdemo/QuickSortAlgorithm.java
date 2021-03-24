package com.res.spring.basics.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers){
        // logic for QuickSort

        return numbers;
    }


}
