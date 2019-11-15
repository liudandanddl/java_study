package com.basic.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-15 6:40 下午
 */
public class SetTest {
    public static void testVisual(Set a) {
        a.addAll(a);
        a.add("two");
        a.add("one");
        a.add("one");
        a.add("two");
        a.add("one");
        System.out.println("a.contains: " + a.contains("one"));
        System.out.println(a);
    }

    public static void main(String[] args) {
        testVisual(new HashSet());
        testVisual(new TreeSet());
    }
}