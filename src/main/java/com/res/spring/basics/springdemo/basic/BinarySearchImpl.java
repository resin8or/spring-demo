package com.res.spring.basics.springdemo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl{

    private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
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

    @PostConstruct
    public void postConstruct(){
        // Once bean created and initialised with dependencies this method will be called.
        logger.info("PostConstruct firing ... ");
    }

    @PreDestroy
    public void preDestroy(){
        // This is called just before the bean is removed from ctx.
        logger.info("PreDestroy firing ... ");
    }

}