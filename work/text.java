package com.hqyj.mc.work;

public class text {
    public static void main(String[] args) {
        work w =new work();
        work.jump a =w.new jump();

        a.A();

        w.setB(false);
        a.A();
    }
}
