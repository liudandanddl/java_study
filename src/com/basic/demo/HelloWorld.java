package com.basic.demo;
/**
 * @Description
 * @auther liudandan
 * @create 2019-11-11 2:14 下午
 */

public class HelloWorld {
    private String s = new String("Hello World !");
    public void append(String a){
        s +=a;
    }
    public void apply(){
        append("apply()");
    }
    public void print(){
        System.out.println(s);
    }
    HelloWorld(){
        System.out.println("1base, HelloWorld");
    }
    HelloWorld(int i){
        System.out.println("1 HelloWorld "+i);
    }
    public static void main(String[] args)
    {

        System.out.println("HelloWorld");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.apply();
        helloWorld.print();
    }
}

class SecondWorld extends HelloWorld{
    SecondWorld(){
        System.out.println("2base, SecondWorld");
    }
    SecondWorld(int i){
        super(i); // 显示调用父类的待参构造方法
        System.out.println("2 SecondWorld  ");
    }
}