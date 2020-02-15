package com.qiuzhongrun.classloader.initial.first.active.use.test4;

public class Father {
    public static String slogan = "爸爸的口号是：叫爸爸!";
    public static String secret = "******";
    static {
        System.out.println("爸爸上线！");
    }
}
