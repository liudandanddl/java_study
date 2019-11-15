package com.basic.container;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description 集合: Vector介绍
 * @auther liudandan
 * @create 2019-11-15 3:47 下午
 */
class Cat{
    private int catNumber;
    Cat(int i){
        this.catNumber = i;
    }
    void print(){
        System.out.println("Cat # "+this.catNumber);
    }
}

class Dog{
    private int dogNumber;
    Dog(int i){
        this.dogNumber = i;
    }
    void print(){
        System.out.println("Dog # "+this.dogNumber);
    }
}
public class VectorTest {

    public static void main(String[] args) {
        Vector cats = new Vector();
        for(int i=0; i<7; i++){
            cats.addElement(new Cat(i)); // 向Vector里添加元素
        }
//        cats.addElement(new Dog(7)); // 添加了一个其他类型的元素， 后面运行期会报错
        for(int i=0; i<cats.size(); i++){
            // 将从Vector获取的Object对象造型成Cat。
            ((Cat)cats.elementAt(i)).print(); // 取出Vector里的元素
        }

        // 参数化构建Vector
        Vector<Cat> cats1 = new Vector<Cat>();
        for(int i=0; i<7; i++){
            cats1.addElement(new Cat(i)); // 向Vector里添加元素
        }
        for(int i=0; i<cats1.size(); i++){
            cats1.elementAt(i).print(); // 不需要强制类型转换了
        }
//        cats1.addElement(new Dog(7)); // 在编译器就会报错

//      用Enumeration遍历整个Vector
        Enumeration<Cat> e = cats.elements();
        while (e.hasMoreElements()){
            e.nextElement().print();
        }



    }
}