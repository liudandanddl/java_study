package com.basic.collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description 数组排序：自己编写比较器
 * @auther liudandan
 * @create 2019-11-18 3:11 下午
 */
public class ArraySort2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // 自定义比较器，字符串比较不区分大小写
        String s1 = ((String)o1).toLowerCase();
        String s2 = ((String)o2).toLowerCase();
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        String[] tempS = {"dlmr", "asdf", "qwe", "as", "Adf", "Zdf", "zas"};
        Arrays.sort(tempS);
        ArraySort.print(tempS); // Adf Zdf as asdf dlmr qwe zas

        String[] tempS1 = {"dlmr", "asdf", "qwe", "as", "Adf", "Zdf", "zas"};
        Arrays.sort(tempS1, new ArraySort2()); // Adf as asdf dlmr qwe zas Zdf
        ArraySort.print(tempS1);

    }



}