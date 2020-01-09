package com.designPattern.creationalPattern.prototypePattern;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setBase(1);
        prototype.setObj(new Integer(2));
        /* 浅复制 */
        Prototype prototype1 = (Prototype) prototype.clone();
        /* 深复制 */
        Prototype prototype2 = (Prototype) prototype.deepClone();
        System.out.println("prototype1.getObj():" + prototype1.getObj());
        System.out.println("prototype2.getObj():" + prototype2.getObj());
        System.out.println(prototype.getObj() == prototype1.getObj());
        System.out.println(prototype1.getObj() == prototype2.getObj());
    }
}
