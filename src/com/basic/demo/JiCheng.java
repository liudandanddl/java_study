package com.basic.demo;

/**
 * @Description 继承,多层聚成
 * @auther liudandan
 * @create 2019-11-13 5:05 下午
 */
public class JiCheng extends SecondWorld {
    // 重写父类print()方法，并扩展一些功能
    public void print(){
        append(" jicheng ");
        super.print();  // 利用super关键字，调用父类的方法。
        append(" end ");  // 这句不会打印出来
    }
    public void foam(){
        append(" foam()");
    }

    // 构造函数会从父开始一层层自动调用
    JiCheng(){
        System.out.println("3 JiCheng");
    }

    JiCheng(String s, int i){
        super(i); // 显示调用父类的代参构造方法
        System.out.println("3 jicheng "+ s);
    }

    public static void main(String[] args) {
        JiCheng jiCheng = new JiCheng();
//        1base, HelloWorld
//        2base, SecondWorld
//        3 JiCheng

        jiCheng.foam(); // Hello World ! foam()
        jiCheng.append("  add  "); // Hello World ! foam()  add
        jiCheng.print();  // Hello World ! foam()  add   jicheng
        System.out.println("~~~~~~~~~~~~~~~");
        HelloWorld.main(args);  // 调用父类的main函数(静态方法)
        System.out.println("~~~~~~~~~~~~~~~");
        JiCheng jiCheng1 = new JiCheng("LDD", 10);

    }
}