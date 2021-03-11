package com.testmaximum;

public class TestMaximum {
    public Integer maximum(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
