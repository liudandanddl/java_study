package com.basic.demo;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-14 4:49 下午
 */
abstract class Contents{
    abstract public int value();
}

interface Destination{
    String readLabel();
}
public class NeiBuClass2 {
    // 私有内部类，除了NeiBuClass2之外任何东西都不能访问它
    private class PContents extends Contents{
        private int i=11;
        @Override
        public int value() {
            return this.i;
        }
    }
    // 被保护内部类，除了NeiBuClass2和NeiBuClass2包内的类以及NeiBuClass2的继承者之外，其他任何东西都不能访问它。
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            this.label = whereTo;
        }
        public String readLabel(){
            return label;
        }
    }
    public Destination dest(String s){
        return new PDestination(s);
    }
    public Contents cont(){
        return new PContents();
    }
}

class Test{
    public static void main(String[] args) {
        NeiBuClass2 n = new NeiBuClass2();
        Contents c = n.cont();
        Destination d = n.dest("Tanzania");

    }
}