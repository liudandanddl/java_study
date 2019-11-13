package com.basic.demo;

import com.basic.tools.P;

/**
 * @Description 若不愿意其他任何人访问那个类，可将所有构建器设为private，
 * 这样在类的一个static成员内部，除自己之外的其他人都无法创建属于那个类的一个对象. 类使用详见 Lunch.java
 * @auther liudandan
 * @create 2019-11-13 3:14 下午
 */
public class Soup {

    // 私有化构造函数，从而保证没人能为这个类创建一个对象。
     private Soup() {}

     // 创建一个static方法，通过它创建一个新的Soup，然后返回指向它的一个句柄。从而让别人可以使用这个类。
     //         Soup p2 = Soup.makeSoup();
     //        p2.f();  // 使用Soup类  这种方法可以创建多个Soup对象
     public static Soup makeSoup(){
         return new Soup();
     }

     // "独子"方案访问使用Soup。它仅允许创建一个对象。
     // 类Soup的对象被创建成Soup的一个static private成员，所以有且只能有一个，除非通过public方法access()，否则根本无法访问它。
    // Soup.access().f(); // 使用Soup类
     private static Soup ps1 = new Soup();
     public static Soup access(){
         return ps1;
     }

     public void f(){
         P.rintln("use Soup");
     }
}
