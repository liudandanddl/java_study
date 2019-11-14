package com.basic.demo;

/**
 * @Description 接口
 * @auther liudandan
 * @create 2019-11-14 12:11 下午
 */
public interface InterfaceTest {
    int i=5; // static & final
    void play(); // 不明确声明，接口中的方法也会默认为public
    String whatt();
    void adjust();
}

// extends 后面可以应用多个接口，用逗号分隔。
interface ExInterfaceTest extends InterfaceTest {
    void destroy();
}