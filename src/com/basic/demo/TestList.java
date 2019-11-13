package com.basic.demo;


import com.basic.tools.P;

import java.awt.*;
import java.util.Vector;


/**
 * @Description 数组相关
 * @auther liudandan
 * @create 2019-11-12 12:06 下午
 */
public class TestList {

    public static void main(String[] args) {
        int[] a1={1, 2, 3, 4};
        int[] a2=a1;  // 本质上复制的是句柄
        for(int i=0; i<a2.length; i++){
            a2[i]++;
        }
//        for(int i=0; i<a1.length; i++){
//            System.out.println(a1[i]); // {2, 3, 4, 5}
//        }

        int[][] a3=new int[2][3]; // 数组值会自动初始化0
        for(int i=0; i<a3.length; i++){
            for(int j=0; j<a3[i].length; j++){
                P.rintln(a3[i][i]);
            }
        }

        Vector v = new Vector();
        List l = new List();

    }
}