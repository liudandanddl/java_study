package com.basic.demo;

/**
 * @Description final 自变量
 * @auther liudandan
 * @create 2019-11-13 6:47 下午
 */
class Gz{
    public void spin(){}
}

public class FinalArguments {
    void with(final Gz gz){
//        gz = new Gz(); // 编译报错，
        gz.spin();
    }
    void without(Gz gz){
        gz = new Gz();
        gz.spin();
    }

    void f(final int i){
//        i++; // 报错。不能改变i的值
        System.out.println(i);  // 基本类型的自变量为final时，只能读取自变量不可改变它
    }

    public static void main(String[] args) {
        FinalArguments f = new FinalArguments();
        // 注意此时我们仍然能为final自变量分配一个null句柄，同时编译器不会捕获它，这与对非final自变量采取的操作时一样的
        f.with(null);
        f.without(null);
    }
}