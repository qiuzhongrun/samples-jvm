package com.qiuzhongrun.classloader.initial.sequence.test1;

import com.qiuzhongrun.classloader.initial.Speaker;

public class Son extends Father {
    public String slogan = "儿子的口号是：打钱!";
    public Speaker classSpeaker = new Speaker("Son class filed initial");
    public static Speaker staticSpeaker = new Speaker("Son static filed initial");
    static {
        System.out.println("Static Son code block!");
    }

    {
        System.out.println("Class Son code block!"+slogan);
    }

    public Son() {
        System.out.println("Son Construct. "+slogan);
    }

}
