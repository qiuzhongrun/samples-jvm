package com.qiuzhongrun.classloader.initial.first.active.use.test4;


import com.qiuzhongrun.classloader.initial.first.active.use.Test;


/**
 * 4. the initialization of a subclass of a class
 */
public class Tester implements Test {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // case 1
        //System.out.println(Son.slogan);

        // case 2
        // -XX:+TraceClassLoading can see loading trace info in output
        System.out.println(Son.secret);
    }
    /**
     * case 1 output:
     * 爸爸上线！
     * 儿子上线！
     * 儿子的口号是：打钱!
     *
     * case 2 output:
     * 爸爸上线！
     * ******
     */
}
