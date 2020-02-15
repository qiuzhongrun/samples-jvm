package com.qiuzhongrun.classloader.loader.test2;

/**
 * test no-delegation load model
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader = new MyClassLoader("myClassLoader");
        Class<?> clazz = classLoader.loadClass("com.qiuzhongrun.classloader.initial.Speaker", "/Users/qiuzhongrun/Documents/GitHub/samples-jvm/out/production/samples-jvm/com/qiuzhongrun/classloader/initial/Speaker.class");
        Object object = clazz.newInstance();

        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());
    }
}
