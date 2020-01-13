package qiuzhongrun.com.classloader.initial.first.active.use.test3B;


import qiuzhongrun.com.classloader.initial.first.active.use.Test;

/**
 * 3. static access
 *      B filed set(putstatic)
 */
public class Tester implements Test {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Son.slogan = "儿子的口号是：给老爸寄钱！";
    }
    /**output:
     * 儿子上线！
     */
}
