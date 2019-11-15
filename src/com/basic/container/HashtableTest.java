package com.basic.container;

import java.util.Hashtable;

/**
 * @Description Hashtable：散列表，一种快速的字典
 * @auther liudandan
 * @create 2019-11-15 5:01 下午
 */

class Counter{
    int i=1;
    public String toString(){
        return Integer.toString(this.i);
    }
}
public class HashtableTest {

    public static void main(String[] args) {
        Hashtable<Integer, Counter> ht = new Hashtable();
        for(int i=0; i<100; i++){
            Integer r = new Integer((int) (Math.random()*20));
            if(ht.containsKey(r))
                ht.get(r).i++;
            else
                ht.put(r, new Counter());
        }
        System.out.println(ht);
    }
}