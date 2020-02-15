package com.qiuzhongrun.classloader.initial.first.active.use.test1;


import com.qiuzhongrun.classloader.initial.first.active.use.Test;


/**
 *  1. a class with main method
 */
public class Tester implements Test {
    public static String slogan = "测试的口号是：不存在没有bug的代码，只存在测不出bug的测试!";

    static {
        System.out.println("测试上线！");
        System.out.println(slogan);
    }

    /**
     * this <em>main</em> function will trigger initialization of Class Tester
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    /**output:
     * 测试上线！
     * 测试的口号是：不存在没有bug的代码，只存在测不出bug的测试!
     * Hello World!
     */
}
