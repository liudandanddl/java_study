package com.basic.innerscopes;

/**
 * @Description 静态内部类
 * @auther liudandan
 * @create 2019-11-15 12:10 下午
 */
public class Paroel3 {

    // 静态内部类
    private static class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    // 非静态内部类
    private class PContentes1 implements Contents{

        @Override
        public int value() {
            return 0;
        }
    }

    public static Contents cont(){
        return new PContents();
    }

    public static void main(String[] args){
        // 创建一个static内部类的对象，我们不需要一个外部类对象
        Contents c = cont();

        // 直接创建一个内部类的对象：必须利用外部类的一个对象生成内部类的一个对象，否则不可能创建内部类的一个对象。
        // 这是由于内部类的对象已同创建它的外部类的对象"默默"连接到一起。
        // 然而，如果生成一个static内部类，就不需要指向外部类对象的一个句柄。
        Paroel3 p = new Paroel3();
        Paroel3.PContentes1 pc1 = p.new PContentes1();

    }
}