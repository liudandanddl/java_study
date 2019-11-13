package com.basic.demo;

/**
 * @Description 和Soup.java配套看
 * @auther liudandan
 * @create 2019-11-13 3:18 下午
 */

public class Lunch {

    void test(){
//        Soup p1 = new Soup();  // 这样创建会报错，因为Soup类的构造函数都是私有的。
        Soup p2 = Soup.makeSoup();
        p2.f();  // 使用Soup类
        Soup p3 = Soup.makeSoup();
        p3.f(); // 使用Soup类

        Soup.access().f(); // 使用Soup类
    }

    public static void main(String[] args) {
        Lunch l1 = new Lunch();
        l1.test();
    }
}