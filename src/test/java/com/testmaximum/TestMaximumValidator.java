package com.testmaximum;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMaximumValidator {

    @Test
    public void givenIntegersMaxAtFirst_ShouldReturnTheMaxAtFirst(){
        Integer max = TestMaximum.maximum(40, 30, 20);
        Assert.assertEquals(Integer.valueOf(40), max);
    }

    @Test
    public void givenIntegersMaxAtSecond_ShouldReturnTheMaxAtSecond(){
        Integer max = TestMaximum.maximum(30, 40, 20);
        Assert.assertEquals( Integer.valueOf(40), max);
    }

    @Test
    public void givenIntegersMaxAtThird_ShouldReturnTheMaxAtThird(){
        Integer max = TestMaximum.maximum(30, 50, 78);
        Assert.assertEquals(Integer.valueOf(78), max);
    }

    @Test
    public void givenFloatsMaxAtFirst_ShouldReturnTheMaxAtFirst(){
        Float firstFloat = (float)55.23, secondFloat = (float)23.33,
                thirdFloat = (float)10.92;
        Float max = TestMaximum.maximum(firstFloat, secondFloat, thirdFloat);
        Assert.assertEquals(firstFloat, max);
    }

    @Test
    public void givenFloatsMaxAtSecond_ShouldReturnTheMaxAtSecond(){
        Float firstFloat = (float)55.23, secondFloat = (float)93.33,
                thirdFloat = (float)10.92;
        Float max = TestMaximum.maximum(firstFloat, secondFloat, thirdFloat);
        Assert.assertEquals( secondFloat, max);
    }

    @Test
    public void givenFloatsMaxAtThird_ShouldReturnTheMaxAtThird(){
        Float firstFloat = (float)55.23, secondFloat = (float)93.33,
                thirdFloat = (float)100.92;
        Float max = TestMaximum.maximum(firstFloat, secondFloat, thirdFloat);
        Assert.assertEquals(thirdFloat, max);
    }
}
