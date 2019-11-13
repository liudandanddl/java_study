package com.basic.demo;

/**
 * @Description
 * @auther liudandan
 * @create 2019-11-13 6:13 下午
 */
public class FinalData {
    // i1和i2都是具有final属性的基本数据类型，并含有编译器的值，所以他们除了能作为编译器的常数使用外，在任何导入方式中也不会出现任何不同。
    final int i1 = 19;
    static final int i2 = 29;
    // i3 public表示可在包外使用，static强调只有一个，final表明是一个常数
    // 对于含有固定初始化值(编译器常数)的final static基本数据类型，变量名全部大写
    public static final int I3=39;

    // i4和i5在编译器的值就是未知的，在运行期间使用随机生成的数字。
    // 针对每一个对象，i4的值都是唯一的
    // 针对每一个对象，i5的值都是相同的，因为i5是在载入时初始化的，而非每创建一个对象时初始化
    final int i4 = (int)(Math.random()*20);
    static final int i5 = (int)(Math.random()*20);

    Value v1 = new Value();
    // 我们不能再将v2绑定到一个新的对象，因为它的属性是final。但是可以改变v2的值，同样的情况使用于数组
    final Value v2 = new Value();
    static final Value v3 = new Value();

    //  我们不能将a重新赋值，但是可以改变a里元素的值
    final int[] a = {1, 2, 3, 4};

    public void print(String id){
        System.out.println(id + ": "+"i4= "+i4+", i5= "+i5);
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData();
        finalData.v1.i++; // 报错，不能修改该值
        finalData.v2.i++;
        for(int i=0; i<finalData.a.length; i++){
            finalData.a[i]++; // 值会被修改
            System.out.println(finalData.a[i]); // [2, 3, 4, 5]
        }

        finalData.v1 = new Value(); // OK, not final
//        finalData.v2 = new Value(); // 编译报错，不能修改
//        finalData.v3 = new Value(); // 编译报错，不能修改
//        finalData.a = new int[3]; // 编译报错，不能修改

        finalData.print("finalData"); // finalData: i4= 7, i5= 12
        System.out.println("Createing new Final Data");
        FinalData finalData2 = new FinalData();
        // i5是静态变量不会改变， finalData.i4 因为被创建过所以不会改变， finalData2.i4是新创建的所以是新值
        finalData.print("fd1"); // fd1: i4= 7, i5= 12
        finalData2.print("fd2"); // fd2: i4= 14, i5= 12

    }
}