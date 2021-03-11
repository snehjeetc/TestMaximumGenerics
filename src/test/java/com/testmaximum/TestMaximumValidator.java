package com.testmaximum;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMaximumValidator {
    private TestMaximum testMaximum;

    @Before
    public void init(){
        testMaximum = new TestMaximum();
    }

    @Test
    public void givenMaxAtFirst_ShouldReturnTheMaxAtFirst(){
        Integer max = testMaximum.maximum(40, 30, 20);
        Assert.assertEquals(Integer.valueOf(40), max);
    }

    @Test
    public void giveMaxAtSecond_ShouldReturnTheMaxAtSecond(){
        Integer max = testMaximum.maximum(30, 40, 20);
        Assert.assertEquals( Integer.valueOf(40), max);
    }
}
