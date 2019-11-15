package com.basic.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-15 7:01 下午
 */
public class MapTest {
    public final static String[][] testData1 = {
            {"Happy", "Cheerful disposition"},
            {"Sleepy", "Prefers dark, quiet places"},
            {"Doc", "Fantasizes about advanced degree"}
    };
    public static Map fill(Map m, Object[][] o){
        for(int i=0; i<o.length; i++)
            m.put(o[i][0], o[i][1]);
        return m;
    }
    public static void  printKeys(Map m){
        System.out.print("Size = "+ m.size()+" , ");
        System.out.print("Keys: "+m.keySet());
        System.out.println("  Values: "+m.values());
    }
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm = (HashMap) fill(hm, testData1);
        printKeys(hm);
        System.out.println(hm.get("Doc"));

    }
}