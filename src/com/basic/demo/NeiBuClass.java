package com.basic.demo;

/**
 * @Description 内部类
 * @auther liudandan
 * @create 2019-11-14 4:21 下午
 */
public class NeiBuClass {

    // 内部类
    class Contentes{
        private int i =11;
        public int value(){
            return this.i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            this.label = whereTo;
        }
        String readLabel(){
            return this.label;
        }

    }
    // 外部类拥有特殊方法，返回指向一个内部类的句柄
    public Destination to(String s){
        return new Destination(s);
    }

    public Contentes cont(){
        return new Contentes();
    }

    public void ship(String dest){
        Contentes contentes = cont();
        Destination destination = to(dest);
    }

    public static void main(String[] args) {
        NeiBuClass neiBuClass = new NeiBuClass();
        neiBuClass.ship("Tanzania");
        NeiBuClass neiBuClass1 = new NeiBuClass();
        // 使用方式 外部类名.内部类名
        NeiBuClass.Contentes c = neiBuClass1.cont();
        // 使用上述方式获得实例，访问Contentes类内部方法。
        System.out.println(c.value()); // 11
        NeiBuClass.Destination d = neiBuClass1.to("Borneo");
        System.out.println(d.readLabel()); // Borneo
//        Contentes contentes = new Contentes(); // 这样实例化编译器报错

    }
}