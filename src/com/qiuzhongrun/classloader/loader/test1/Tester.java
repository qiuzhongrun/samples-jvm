package com.qiuzhongrun.classloader.loader.test1;

import static java.lang.ClassLoader.getSystemClassLoader;

/**
 * test load by my class loader
 *      use my classloader replace app classloader in line 11
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader = new MyClassLoader(getSystemClassLoader().getParent(),"myClassLoader");
        classLoader.setPath("/Users/qiuzhongrun/Documents/GitHub/samples-jvm/out/production/samples-jvm/");
        Class<?> clazz = classLoader.loadClass("com.qiuzhongrun.classloader.initial.Speaker");
        Object object = clazz.newInstance();

        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());
    }
}
