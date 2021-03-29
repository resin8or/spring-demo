package com.res.junit;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

class MathExamplesTest {

    private static Logger logger = LoggerFactory.getLogger(MathExamplesTest.class);

    @BeforeAll
    public static void beforeClass(){
        logger.info("Before Class executing....");
    }

    @BeforeEach
    public void beforeTest(){
        logger.info("Before executing tests ...");
    }

    @Test
    public void sum_with3numbers() {
        logger.info("starting test for sum_with3numbers ...");
        MathExamples mathExamples = new MathExamples();
        //System.out.println(mathExamples.sum(new int[]{1, 2, 3}));
        int result = mathExamples.sum(new int[]{1,2,3});

        assertEquals(6, result);

    }

    @Test
    public void sum_with4numbers() {
        logger.info("starting test for sum_with4numbers ...");
        MathExamples mathExamples = new MathExamples();
        //System.out.println(mathExamples.sum(new int[]{1, 2, 3}));
        int result = mathExamples.sum(new int[]{1,2,30, 40});

        assertEquals(73, mathExamples.sum(new int[]{1,2,30, 40}));
    }

    @AfterEach
    public void afterTest(){
        logger.info("After executing tests ...");
    }

    @AfterAll
    public static void afterClass(){
        logger.info("After Class executing....");
    }

}