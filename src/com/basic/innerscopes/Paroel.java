package com.basic.innerscopes;

/**
 * @Description 在方法内定义内部类
 * @auther liudandan
 * @create 2019-11-14 6:19 下午
 */
public class Paroel {

    public Destination dest(String s){
        // 内部类PDestination 属于dest方法的一部分，而不是类Paroel的一部分。
        // 因此PDestination不可从dest的外部访问
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                this.label = whereTo;
            }
            public String readLabel(){
                return this.label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args){
        Paroel p = new Paroel();
        Destination d = p.dest("Tanzania"); // 上溯造型
    }
}