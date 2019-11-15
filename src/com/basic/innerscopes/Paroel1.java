package com.basic.innerscopes;

/**
 * @Description 在任意作用域内定义内部类.
 * 类TrackingSlip嵌套于一个if语句的作用域内。这并不意味着类是有条件创建的，它会随同其他所有东西得到编译。
 * 然而，在定义它的那个作用域之外，它是不可使用的。除此之外它和一个普通类并没有什么区别。
 * @auther liudandan
 * @create 2019-11-14 6:26 下午
 */
public class Paroel1 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    this.id = s;
                }
                String getSlip(){
                    return this.id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // 这里不能再用TrackingSlip
    }
    public void track(){internalTracking(true);}

    public static void main(String[] args) {
        Paroel1 p = new Paroel1();
        p.track();

    }
}