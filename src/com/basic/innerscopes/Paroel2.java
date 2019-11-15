package com.basic.innerscopes;

/**
 * @Description 匿名内部类
 * @auther liudandan
 * @create 2019-11-14 6:51 下午
 */
public class Paroel2 {
    public Destination cont(){
        // 匿名内部类
        return new Destination(){
            private String label;
            @Override
            public String readLabel() {
                return label;
            }
        };  // 分号表示包含匿名内部类的表达式结束
    }

    public static void main(String[] args) {
        Paroel2 p = new Paroel2();
        Destination c = p.cont();
        c.readLabel();

    }
}