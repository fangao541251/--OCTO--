package com.fangao.sc01.sc;

import java.util.Scanner;
import java.util.Random;

/*
    Random 类
    产生随机数
        使用步骤:
            1.导包
            2.创建Random类型的引用
            3.使用功能
                nextInt() 随机 产生int类型的整数
                nextInt(整数n) 随机int类型的整数,范围[0,n)
                nextDouble() 随机小数   [0.0,1.0)


           产生随机整数的公式:
            [0,n)  ran.nextInt(n)
            [0,n]  ran.nextInt(n+1)
            [min,max)  ran.nextInt(max-min)+min  =>[0,max-min)+min =>[min,max)
            [min,max]  ran.nextInt(max-min+1)+min


        练习 : 随机生成[1,100] 之间的随机整数

    伪随机数
 */

import java.util.Random;

public class demo03 {
    public static void main(String[] args) {
        //1.创建Random类型的引用
        Random ran = new Random();
        //2.使用功能
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt());


        //产生[0,4]之间的随机整数 ->[0,5)
        System.out.println(ran.nextInt(5));

        //[2,5) ran.nextInt(max-min)+min
        System.out.println(ran.nextInt(5-2)+2 );
        System.out.println(ran.nextInt(5-2)+2 );


        System.out.println("-----------------------------");
        //[2,5]
        System.out.println(ran.nextInt(5-2+1)+2);
        System.out.println(ran.nextInt(5-2+1)+2);
        System.out.println(ran.nextInt(5-2+1)+2);


        System.out.println(ran.nextDouble());
        System.out.println(ran.nextDouble());


        System.out.println(ran.nextInt(100-1+1)+2);
        System.out.println(ran.nextInt(100-1+1)+2);
        System.out.println(ran.nextInt(100-1+1)+2);
        System.out.println(ran.nextInt(100-1+1)+2);
        System.out.println(ran.nextInt(100-1+1)+2);
        System.out.println(ran.nextInt(100-1+1)+2);
        System.out.println(ran.nextInt(100-1+1)+2);
    }

}
