package com.basic.collections;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description Arrays类为所有基本数据类型的数组提供了一个过载的sort()和binarySearch()，
 * 它们也可用于String和Object。
 * @auther liudandan
 * @create 2019-11-18 11:49 上午
 */
public class ArraySort {
    static Random r = new Random();
    static String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz";
    static char[] src = source.toCharArray(); // 字母数组

    // 创建随机字符串
    public static String randString(int length){
        char[] buf = new char[length];
        int rand;
        for(int i=0; i<length; i++){
            rand = Math.abs(r.nextInt()) %src.length;
            buf[i] = src[rand];
        }
        return new String(buf);
    }

    // 创建随机字符串数组
    public static String[] randString(int length, int size){
        String[] s = new String[size];
        for(int i=0; i<size; i++){
            s[i] = randString(length);
        }
        return s;
    }
    public static void print(String[] s){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    public static void print(byte[] b){
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        byte[] b = new byte[15];
        r.nextBytes(b); // Random.nextBytes()用随机选择的字节填充数组自变量
        print(b);
        Arrays.sort(b); // 字符数组排序
        print(b);
        //  Arrays.binarySearch 使用二分搜索法来搜索指定的数组(排序后的数组)，以获得指定对象。返回要搜索元素的索引值。
        // 如果数组没排序就使用，可能明明存在却也找不到
        int loc = Arrays.binarySearch(b, b[10]);
        System.out.println("Location of "+b[10]+" = "+loc);

        // String的sort 和 search
        String[] s = randString(4, 10);
        print(s);
        Arrays.sort(s); // 字符串数组排序
        print(s);
        loc = Arrays.binarySearch(s, s[4]);
        System.out.println("Location of "+s[4]+" = "+loc);

        String[] tempS = {"dlmr", "asdf", "qwe", "as"};
        int f = Arrays.binarySearch(tempS, "as");
//        System.out.println(f); // -1
        Arrays.sort(tempS);
        print(tempS);
        f = Arrays.binarySearch(tempS, "as");
        System.out.println(f); // 0

    }
}