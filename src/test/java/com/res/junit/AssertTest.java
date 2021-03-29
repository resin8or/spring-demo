package com.res.junit;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void test(){
        boolean condition = true;
        int[] array1 = {1,2};
        int[] array2 = {1,2};
        assertEquals(1,1);
        assertEquals(true, condition);
        assertTrue(condition);
        //assertFalse(condition);
        assertNotNull(condition);
        assertArrayEquals(new int[]{1,2}, new int[]{1,2});
        assertArrayEquals(array1, array2);
    }
}
