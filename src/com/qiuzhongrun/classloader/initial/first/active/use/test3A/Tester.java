package com.qiuzhongrun.classloader.initial.first.active.use.test3A;


import com.qiuzhongrun.classloader.initial.first.active.use.Test;

/**
 * 3. static access
 *      A field get(getstatic)
 */
public class Tester implements Test {
    /**
     * only test one line at the same time for different cases
     * @param args
     */
    public static void main(String[] args) {
        //System.out.println(Son.slogan);      //case 1
        //System.out.println(Son.finalSlogan); //case 2
        System.out.println(Son.finalRuntimeSlogan);      //case 3
    }
    /**
     * case 1 output:
     * 儿子上线！
     * 儿子的口号永远是：打钱！
     *
     * case 2 output:
     * 儿子的口号永远是：打钱！
     *
     * case 3 output:
     * 儿子上线！
     * 儿子的口号运行时是：打钱！fc463a30-94f4-4a3c-9eb4-fe42b6f65742
     *
     * ? why case 2 not initialize Son.class
     * case Son.finalSlogan is modified with <em>final<em/>
     * it means Son.finalSlogan's value will be set in the constant pool of which Class invoked it(here is Tester.class)
     * so it doesn't need to do the Son.class's initialization
     *
     * ? why case 3 with <em>final<em/> still need to do initialization
     */
}
