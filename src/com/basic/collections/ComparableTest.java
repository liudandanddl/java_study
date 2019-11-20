package com.basic.collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description 对于想要进行比较/排序的类，可以实现Comparable接口
 * Comparable：能不能比，去实现他就能比了。compareTo(User o)
 * Comparator:比较器，拿来比较的。 compare(User1 o1, User1 o2)
 * 其实二者并无本质上的区别，实际上他们的区别就是comareTo方法的实现是JDK已经实现过的，而compare则需要自己手动实现，
 * @auther liudandan
 * @create 2019-11-18 3:42 下午
 */

class User implements Comparable<User>{
    private String name;
    private Integer age;
    public User(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return this.name + " " + this.age;
    }
    // compareTo方法返回int型的负数、0、正数，分别代表小于、等于、大于指定的对象。
    @Override
    public int compareTo(User o) {
        // 按照年龄排序
        return this.age.compareTo(o.age);
    }
}

class User1 implements Comparator<User1>{
    private String name;
    private Integer age;
    public User1(String name, int age){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compare(User1 o1, User1 o2) {
        if(o1.age<o2.age)
            return -1;
        if(o1.age == o2.age)
            return 0;
        return 1;
    }
}
public class ComparableTest{
    public static void main(String[] args) {
        User c1 = new User("李白", 43);
        User c2 = new User("杜甫", 23);
        System.out.println(c1.compareTo(c2)); // 1

        User1 u1 = new User1("李白", 43);
        User1 u2 = new User1("杜甫", 23);
        System.out.println(u1.compare(u1, u2)); // 1
    }


}