package com.qiuzhongrun.classloader.initial.first.active.use.test3C;


import com.qiuzhongrun.classloader.initial.first.active.use.Test;

/**
 * 3. static access
 *      C method invoke(invokestatic)
 */
public class Tester implements Test {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Son.shout();
    }
    /**output:
     * 儿子上线！
     * 爸爸!
     */
}
