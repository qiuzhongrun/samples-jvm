package com.qiuzhongrun.classloader.initial.sequence.test2.test1;

import com.qiuzhongrun.classloader.initial.sequence.Test;

public class Tester implements Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(Singleton.count);
        System.out.println(Singleton.amount);
    }
}
