package com.basic.container;

import java.util.Stack;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-15 4:48 下午
 */
public class StackTest {
    static String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "Novvember", "December"};

    public static void main(String[] args) {
        Stack s = new Stack();
        for(int i=0; i<months.length; i++){
            s.push(months[i] + " ");
        }
        System.out.println("s = "+s);

        s.addElement("The last line");
        System.out.println("element5 = "+ s.elementAt(5));
        System.out.println("popping elements: ");
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }
}