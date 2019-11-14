package com.basic.demo;

/**
 * @Description 多行性讨论 + 抽象类
 * @auther liudandan
 * @create 2019-11-14 11:18 上午
 */
class Instrument{
    public void play(){
        System.out.println("Instrument play");
    }
}
class Stringed extends Instrument{
    // 过载父类方法
    public void play(int i){
        System.out.println("Stringed play");
    }
}

class Brass extends Instrument{}

abstract class Wind extends Instrument{
    // 重写(覆盖)父类方法
    public void play(){
        System.out.println("Wind play");
    }
    // 声明一个抽象方法，则类也变成抽象类
    public abstract void adlust();
}

// 继承抽象类必须实现抽象方法
class WoWind extends Wind{
    @Override
    public void adlust() {
    }
}

public class DuoXingXing {
    // 入参是父类，所有子类都能用这个方法。不用针对每个子类去编写。
    public static void tune(Instrument instrument){
        instrument.play();
    }

    public static void main(String[] args) {
        Wind wind = new WoWind();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();
        // 上溯造型，将子类当做父类用
        tune(wind); // Wind play
        tune(stringed); // Instrument play
        tune(brass); // Instrument play

    }
}