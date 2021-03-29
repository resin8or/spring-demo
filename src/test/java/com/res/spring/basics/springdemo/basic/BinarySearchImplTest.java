package com.res.spring.basics.springdemo.basic;

import com.res.spring.basics.springdemo.SpringDemoBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

// Load the context and define the runner
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringDemoBasicApplication.class)
public class BinarySearchImplTest {
    //Bean can be fetched from context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }
}