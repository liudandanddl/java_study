package com.basic.demo;

/**
 * @Description 构建器，初始化，this
 * @auther liudandan
 * @create 2019-11-11 5:31 下午
 */
public class TestIns {
    private int pCount=0;
    private String s=new String("null");

    TestIns(int p){
        pCount = p;
        System.out.println("pCount: "+pCount);
    }

    TestIns(String ss){
        s =ss;
        System.out.println("s= "+s);
    }

    TestIns(String s, int p1){
        this(p1); // 可用this调用构建器，但不可调用两个。
//        this(s);  // 会报错
        this.s = s; // this.s 由于自变量s的名字和成员数据s的名字是相同的，所以使用this.s来引用成员数据。

    }
}