package com.hqyj.mc.innerclazzDemo1;
//成员内部类:类中方法外的类，可以使用全部修饰符
//外部类
public class OutClazz {
    private String name = "周五";
    public int age = 12;
    public class innerClazz{
        private String name = "周四";
        String sex = "男";
        //内部类
        public void innerA(){
            System.out.println(name);
            System.out.println(OutClazz.this.name);
            System.out.println(age);
        }
    }


    public class innerClazz2 {
        int a=1;
    }
}
