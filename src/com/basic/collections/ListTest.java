package com.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-15 6:28 下午
 */
public class ListTest {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add(1);
        List b = new ArrayList();
        int[] t = {1,2,3,4};
        b.addAll(Collections.singleton(t));



    }
}