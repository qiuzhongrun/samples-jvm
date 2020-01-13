package qiuzhongrun.com.classloader.initial.first.active.use.test2B;


import qiuzhongrun.com.classloader.initial.first.active.use.Test;

/**
 * 2. a new instance of a class is created
 *      B. reflection
 */
public class Tester implements Test {
    /**
     * <em>Class.forName</em> is a reflect function that will trigger the initialization of Class Son
     * @param args
     */
    public static void main(String[] args) {
        try {
            Class.forName("qiuzhongrun.com.classloader.initial.first.active.use.test2B.Son");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**output:
     * 儿子上线！
     */
}
