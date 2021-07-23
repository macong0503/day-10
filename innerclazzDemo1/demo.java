package com.hqyj.mc.innerclazzDemo1;

public class demo {
    public static void main(String[] args) {

        OutClazz.innerClazz out = new OutClazz().new innerClazz();
        System.out.println(out.sex);
        out.innerA();

       /* OutClazz out1=new OutClazz();
        OutClazz.innerClazz2 inner2 = out1.new innerClazz2();
        System.out.println(inner2.a);*/
    }
}