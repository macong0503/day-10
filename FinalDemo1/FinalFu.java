package com.hqyj.mc.FinalDemo1;

public /*final*/ class FinalFu {
    /*
    * 1、被final修饰的类不能被继承
    * 2、被于inal修饰的方法不能被重写
    * 3、被于inal修饰的普通变量就是一个常量，不能被修改，且必须赋值
    * 4、被于inal修饰的引用类型变量有一个地址值，不能被修改
    * */
    public final int AGE;

    public FinalFu(int age) {
        AGE = age;
    }
}
