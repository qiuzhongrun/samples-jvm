package com.qiuzhongrun.classloader.loader;


public class ShowClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while (classLoader!=null){
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }

        System.out.println("-------------");

        Class<?> clazz = ShowClassLoader.class;
        System.out.println("ShowClassLoader clazz  class loader: "+ clazz.getClassLoader());
        System.out.println("String clazz  class loader: "+ String.class.getClassLoader());
        System.out.println("thread class loader: "+Thread.currentThread().getContextClassLoader());
        System.out.println("system class loader: "+ClassLoader.getSystemClassLoader());
        //System.out.println("Caller class loader: "+DriverManager.getCallerClassLoader());

    }
}
