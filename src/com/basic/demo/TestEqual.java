package com.basic.demo;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-11 3:51 下午
 */

class Value{
    int i;
}
public class TestEqual {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        Integer n3 = n1;
        System.out.println(n1 == n2); // false
        System.out.println(n1.equals(n2)); // true
        System.out.println(n3==n1); // true

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = 100;
        v2.i = 100;
        System.out.println(v1.equals(v2)); // false



    }
}