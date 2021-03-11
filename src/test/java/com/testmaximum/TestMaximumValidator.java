package com.testmaximum;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMaximumValidator {

    @Test
    public void givenMaxAtFirst_ShouldReturnTheMaxAtFirst(){
        Integer max = TestMaximum.maximum(40, 30, 20);
        Assert.assertEquals(Integer.valueOf(40), max);
    }

    @Test
    public void givenMaxAtSecond_ShouldReturnTheMaxAtSecond(){
        Integer max = TestMaximum.maximum(30, 40, 20);
        Assert.assertEquals( Integer.valueOf(40), max);
    }

    @Test
    public void givenMaxAtThird_ShouldReturnTheMaxAtThird(){
        Integer max = TestMaximum.maximum(30, 50, 78);
        Assert.assertEquals(Integer.valueOf(78), max);
    }
}
