package com.qiuzhongrun.classloader.loader.test4;

import java.io.*;

public class MyClassLoader extends ClassLoader {
    private String classLoaderName;
    private String path;
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

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] data = this.loadClassData(className);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            className = className.replace(".", "/");
            is = new FileInputStream(new File(path + className + fileExtension));
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

    public void setPath(String path) {
        this.path = path;
    }
}
