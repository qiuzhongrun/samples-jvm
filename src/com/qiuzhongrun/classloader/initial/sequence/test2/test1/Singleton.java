package com.qiuzhongrun.classloader.initial.sequence.test2.test1;

import com.qiuzhongrun.classloader.initial.Speaker;

public class Singleton {
    public static int count;
    public static int amount=0;
    public static Speaker speaker = new Speaker("Singleton");

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Init Construct");
        count++;
        amount++;
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
