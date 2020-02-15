package com.qiuzhongrun.classloader.initial.sequence.test1;

import com.qiuzhongrun.classloader.initial.Speaker;

public class Father {
    public String slogan = "爸爸的口号是：叫爸爸!";
    public Speaker classSpeaker = new Speaker("Father class filed initial");
    public static Speaker staticSpeaker = new Speaker("Father static filed initial");
    static {
        System.out.println("Static Father code block!");
    }

    {
        System.out.println("Class Father code block!"+slogan);
    }

    public Father() {
        System.out.println("Father Construct. "+slogan);
    }
}
