package qiuzhongrun.com.classloader.initial.array;

/**
 * 1. new array does not trigger initialization
 * 2. array's class is "[L"+"type class",
 *      ['s number equals it's number of dimensions,
 * 3. array's super class is java.lang.Object,
 *      whatever dimensions of this array
 */
public class Tester {
    public static void main(String[] args) {

        char[] chars = new char[1];
        printArray(chars, "1");

        boolean[] booleans = new boolean[1];
        printArray(booleans, "2");

        byte[] bytes = new byte[1];
        printArray(bytes, "3");

        short[] shorts = new short[1];
        printArray(shorts, "4");

        int[] ints = new int[1];
        printArray(ints, "5");

        long[] longs = new long[1];
        printArray(longs, "6");

        float[] floats = new float[1];
        printArray(floats, "7");

        double[] doubles = new double[1];
        printArray(doubles, "8");

        Son[] sons = new Son[1];
        printArray(sons, "9");
        sons = new Son[0];
        printArray(sons, "10");

        Son[][] son2dArr = new Son[1][1];
        printArray(son2dArr, "11");

    }

    private static void printArray(Object o, String seq) {
        System.out.println(seq);
        System.out.println(o.getClass());
        System.out.println(o.getClass().getSuperclass());
        System.out.println();
    }
}
