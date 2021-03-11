package com.testmaximum;

public class TestMaximumGeneric <T extends Comparable<T>>{
    private T x, y, z;
    public TestMaximumGeneric(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum(){
        return TestMaximum.maximum(x, y, z);
    }

}
