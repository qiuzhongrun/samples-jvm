package com.qiuzhongrun.classloader.loader.test2;

import java.io.*;

public class MyClassLoader extends ClassLoader {
    private String classLoaderName;
    private final String fileExtension = ".class";

    public MyClassLoader(String classLoaderName) {
        super();
        this.classLoaderName = classLoaderName;
    }

    public MyClassLoader(ClassLoader parent , String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString() {
        return "["+ classLoaderName +"]";
    }

    protected Class<?> findClass(String className, String path) throws ClassNotFoundException {
        byte[] data = this.loadClassData(path);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            is = new FileInputStream(new File(className));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1!=(ch = is.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is!=null) {
                    is.close();
                }
                if (baos!=null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data;
    }

    protected Class<?> loadClass(String name, String path)
            throws ClassNotFoundException
    {
        System.out.println("In my class loader. "+classLoaderName);
        Class<?> c = findClass(name, path);

        resolveClass(c);
        return c;
    }
}
