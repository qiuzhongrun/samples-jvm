package com.qiuzhongrun.classloader.initial.first.active.use.test2D;


import com.qiuzhongrun.classloader.initial.first.active.use.Test;

import java.io.*;

/**
 * 2. a new instance of a class is created
 *      D. deserialization
 */
public class Tester implements Test {
    /**
     * <em>Serialize</em> will trigger the initialization of Class Son
     * <em>Deserialize</em> also will trigger the initialization of Class Son
     * @param args
     */
    public static void main(String[] args) {
        //serialize();
        deserialize();

    }
    /**
     * case 1: uncomment serialize() && comment deserialize()
     * output:
     * 儿子上线！
     *
     * case 2: uncomment deserialize() && comment serialize()
     * output:
     * 儿子上线！
     *
     * case 3: uncomment deserialize() && uncomment serialize()
     * output:
     * 儿子上线！
     *
     * think about why case 3 only have one line output
     */

    private static void serialize() {
        String freezeFile = "serializeFile";
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(freezeFile);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Son son = new Son("KillSome");
            objectOutputStream.writeObject(son);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null!=objectOutputStream) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void deserialize() {
        String freezeFile = "serializeFile";
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(freezeFile);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Son son = (Son) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null!=objectInputStream) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
