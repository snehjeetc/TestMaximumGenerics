package com.testmaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaximum {
    public static <T extends Comparable<T>> T maximum(T ...var){
        if(var == null)
            return null;
        List<T> arrayList = Arrays.asList(var);
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList.get(0);
    }
}
