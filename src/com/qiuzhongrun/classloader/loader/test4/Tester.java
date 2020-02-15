package com.qiuzhongrun.classloader.loader.test4;

/**
 * load twice by the same classloader, test clazz's hashcode
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader = new MyClassLoader("myClassLoader");
        String className = "com.qiuzhongrun.sample.bitwise.CountNum";
        classLoader.setPath("/Users/qiuzhongrun/IdeaProjects/gitee/sample/out/production/sample/");
        Class<?> clazz = classLoader.loadClass(className);
        Object object = clazz.newInstance();

        System.out.println(object.getClass().getClassLoader());

        System.out.println(clazz.hashCode());
        classLoader.setPath("/Users/qiuzhongrun/IdeaProjects/gitee/sample/out/production/sample/");
        Class<?> clazz2 = classLoader.loadClass(className);

        int hashCode = clazz2.hashCode();
        System.out.println(hashCode);

    }
}
