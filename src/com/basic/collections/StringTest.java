package com.basic.collections;

/**
 * @Description 字符串相关练习
 * @auther liudandan
 * @create 2019-11-18 3:35 下午
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "aAbD";
        String s2 = new String("aADSFg");
        s1 = s1.toLowerCase();
        s2 = s2.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);

    }
}