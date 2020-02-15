package com.qiuzhongrun.classloader.loader.test5;

/**
 * load twice by different classloader, test clazz's hashcode
 *      classloader naming space
 *      this is why we need delegation load model
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        String className = "com.qiuzhongrun.sample.bitwise.ShowNumBitDistribution";

        MyClassLoader classLoader1 = new MyClassLoader("myClassLoader");
        classLoader1.setPath("/Users/qiuzhongrun/IdeaProjects/gitee/sample/out/production/sample/");
        Class<?> clazz = classLoader1.loadClass(className);
        Object object = clazz.newInstance();

        System.out.println(object.getClass().getClassLoader());

        System.out.println(clazz.hashCode());


        MyClassLoader classLoader2 = new MyClassLoader("myClassLoader");
        classLoader2.setPath("/Users/qiuzhongrun/IdeaProjects/gitee/sample/out/production/sample/");
        Class<?> clazz2 = classLoader2.loadClass(className);

        int hashCode = clazz2.hashCode();
        System.out.println(hashCode);

    }
}
