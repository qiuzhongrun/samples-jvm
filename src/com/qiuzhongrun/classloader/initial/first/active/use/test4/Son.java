package com.qiuzhongrun.classloader.initial.first.active.use.test4;

public class Son extends Father {
    public static String slogan = "儿子的口号是：打钱!";
    static {
        System.out.println("儿子上线！");
    }

}
