package com.hqyj.mc.innerclazzDemo2;

public class Test {
    public static void main(String[] args) {
       //匿名内部类
        Out out = new Out() {
            @Override
            public void Amethod() {
                System.out.println("匿名内部类重写接口方法");
            }

            @Override
            public void Bmethod() {
                System.out.println("匿名内部类重写接口方法2");
            }
        };
        out.Amethod();
        out.Bmethod();
//匿名对象
        new Out() {
            @Override
            public void Amethod() {
                System.out.println("匿名对象使用匿名内部类");
            }

            @Override
            public void Bmethod() {

            }
        }.Amethod();

    }
    public static void a(Out out){
        out.Amethod();
        out.Bmethod();

    }
}
