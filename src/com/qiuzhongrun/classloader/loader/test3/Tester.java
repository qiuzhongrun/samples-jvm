package com.qiuzhongrun.classloader.loader.test3;

/**
 * test class not exist in app scope
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader = new MyClassLoader("myClassLoader");
        String className = "com.qiuzhongrun.sample.bitwise.Shift";
        classLoader.setPath("/Users/qiuzhongrun/IdeaProjects/gitee/sample/out/production/sample/");
        Class<?> clazz = classLoader.loadClass(className);
        Object object = clazz.newInstance();

        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());
    }
}
