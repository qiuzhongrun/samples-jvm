package com.qiuzhongrun.classloader.loader.test6;

/**
 * test unload
 *      add JVM Options -XX:+TraceClassUnloading
 *
 * while there is no use in application(detect by jvm garbage collect algorithm)，
 * classes loaded by self-classloader would be unload
 *
 * jvm ClassLoaders(bootstrap\extend\app) will always have the references to classes they loaded,
 * so these classes would never unload during jvm life
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        String className = "com.qiuzhongrun.sample.bitwise.CountNum";

        MyClassLoader classLoader = new MyClassLoader("myClassLoader");
        classLoader.setPath("/Users/qiuzhongrun/IdeaProjects/gitee/sample/out/production/sample/");
        Class<?> clazz = classLoader.loadClass(className);
        Object object = clazz.newInstance();

        System.out.println(object);

        classLoader = null;
        clazz = null;
        object = null;
        System.gc();
        System.out.println(object);
        System.out.println("Finished!");
    }
}
