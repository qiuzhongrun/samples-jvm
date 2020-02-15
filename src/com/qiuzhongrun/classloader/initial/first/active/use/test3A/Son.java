package com.qiuzhongrun.classloader.initial.first.active.use.test3A;

import java.util.UUID;

public class Son {
    public static String slogan = "儿子的口号是：打钱！";
    public static final String finalSlogan = "儿子的口号永远是：打钱！";
    public static final String finalRuntimeSlogan = "儿子的口号运行时是：打钱！" + UUID.randomUUID();

    static {
        System.out.println("儿子上线！");
    }

}
