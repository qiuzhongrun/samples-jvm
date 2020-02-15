package com.qiuzhongrun.classloader.initial.in2face.test1;

import com.qiuzhongrun.classloader.initial.Speaker;

public interface Fish extends Animal{
    int num = 5;
    Speaker fishSpeaker = new Speaker("Fish");
    Speaker testSpeaker = new Speaker("test Fish");
}
