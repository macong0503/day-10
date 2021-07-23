package com.hqyj.mc;

import java.util.Scanner;

//古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
// 问每个月的兔子对数为多少？(输入月份，求出当月兔子有多少)
public class demo {
    public static int tuzi(int i){
        if (i==1 || i == 2){
            return 1;
        }
        else{
            return tuzi(i-1) + tuzi(i-2);
        }


    }

    public static void main(String[] args) {
        System.out.println("请输入月份：");
        int b = new Scanner(System.in).nextInt();
        System.out.println("兔子对数为："+tuzi(b));
    }
}
