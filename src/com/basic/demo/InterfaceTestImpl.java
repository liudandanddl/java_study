package com.basic.demo;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-14 12:14 下午
 */
public class InterfaceTestImpl implements InterfaceTest {

    public static void main(String[] args) {

    }

    // 实现一个接口的时候，来自接口的方法必须定义为public。否则会默认为友好的，而且会限制我们在继承过程中对一个方法的访问。
    @Override
    public void play() {

    }

    @Override
    public String whatt() {
        return null;
    }

    @Override
    public void adjust() {

    }
}