package qiuzhongrun.com.classloader.initial.first.active.use.test2A;

import qiuzhongrun.com.classloader.initial.first.active.use.Test;

/**
 *  2. a new instance of a class is created
 *      A. new(new)
 */
public class Tester implements Test {
    /**
     * this <em>new</em> key word will trigger the initialization of Class Son
     * @param args
     */
    public static void main(String[] args) {
        Son son = new Son();
    }
    /**output:
     * 儿子上线！
     */
}
