package qiuzhongrun.com.classloader.initial.first.active.use.test2D;

import java.io.Serializable;

public class Son implements Serializable {
    public static String slogan = "儿子的口号是：打钱!";
    static {
        System.out.println("儿子上线！");
    }

    private String name;

    public Son() {}

    public Son(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
