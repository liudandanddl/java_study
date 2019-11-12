package com.basic.demo;
/**
 * @Description
 * @auther liudandan
 * @create 2019-11-11 2:14 下午
 */

public class TestOne {
    public static void main(String[] args)
    {
        String s = new String("a string");
        int i=1;
        System.out.println(i);
        System.out.println(++i); // 2
        System.out.println(i++); // 2
        System.out.println(i); // 3

        for(int j=0,k=0; j<10 && k!=10; j++, k++)
        {
            System.out.println(j+" "+k);
        }

        char c = (char) (Math.random()*26 + 'a'); // 向下转型，会将多余的部分砍掉，不做任何处理。去尾法。
        System.out.println(c);

       for(int num=1; num<=10; num++)
       {
           System.out.println(num);
           if(num==4){
               break;
           }
           switch (num){
               case 1:
                   System.out.println("num==1");
               case 2:
                   System.out.println("num==2");
                   break;
               default:
                   System.out.println("num=="+num);
           }

       }
    }
}
