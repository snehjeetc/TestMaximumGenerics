package com.testmaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMaximumGenericValidator<T extends Comparable<T>> {

    private T expected;
    private TestMaximumGeneric<T> testMaximumGeneric;

    public TestMaximumGenericValidator(T x, T y, T z, T expected){
        testMaximumGeneric = new TestMaximumGeneric<T>(x, y, z);
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {(Integer)1, (Integer)2, (Integer)3, (Integer)3},
                {(String)"AAA", (String)"BBB", (String)"CCCC", (String)"CCCC"},
                {Float.valueOf((float) 23.53),Float.valueOf((float) 55.78), Float.valueOf((float) 89.23), Float.valueOf((float) 89.23)}
        });
    }

    @Test
    public void testMaximumGeneric_shouldReturnMaximum(){
        T max = testMaximumGeneric.maximum();
        Assert.assertEquals(expected, max);
    }
}
