package com.basic.demo;

/**
 * @Description 空白final
 * @auther liudandan
 * @create 2019-11-13 6:41 下午
 */
class Poppet{}
public class FinalBlank {
    final int i=0;
    final int j; // 空白final
    final Poppet p; // 空白 final handle

    // 强行要求对final进行赋值处理，要么在定义字段时使用一个表达式，要么在每个构建器中。这样就可以确保final字段在使用前获得正确的初始化。
    FinalBlank(){
        // 对final进行初始化
        j = 1;
        p = new Poppet();
    }

    FinalBlank(int x){
        j = x;
        p = new Poppet();
    }

    public static void main(String[] args) {
        FinalBlank bf = new FinalBlank();
    }
}