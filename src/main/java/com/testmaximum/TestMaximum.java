package com.testmaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaximum {

    @SafeVarargs
    public static <T extends Comparable<T>> T maximum(T ...args){
        if(args == null)
            return null;
        List<T> arrayList = Arrays.asList(args);
        Collections.sort(arrayList, Collections.reverseOrder());
        printMax(arrayList);
        return arrayList.get(0);
    }

    public static <T> void printMax(List<T> args){
        System.out.println("Values in decreasing order: ");
        System.out.println(args + "Max: " + args.get(0));
    }
}
