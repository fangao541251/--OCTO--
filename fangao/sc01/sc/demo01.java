package com.fangao.sc01.sc;

/*
    基本数据类型:
        数据类型 变量名 = 赋值;
        int a = 1;
    引用数据类型:
        1) 定义一个当前引用数据类型 的 一个引用|变量
        引用数据类型 变量名|引用 = new 引用数据类型();
        2) 可以引用|变量使用当前引用数据类型中的功能
            引用名|变量名.功能名字();

    Scanner : 接收用户键盘输入的内容
        步骤 :
            1.导包
                告诉java类的位置
                import 报名.类名;
                import java.util.Scanner;
                位置: 类的上面 导包

            2.定义一个Scanner数据类型的引用
                Scanner sc = new Scanner(System.in);

            3.使用功能
                sc.功能名字();
                nextInt() 接受用户键盘输入的int类型整数
                nextByte() 接受用户键盘输入的byte类型整数
                nextShort() 接受用户键盘输入的short类型整数
                nextLong() 接受用户键盘输入的Long类型整数
                nextDouble() 接受用户键盘输入的double类型小数
                nextFloat() 接受用户键盘输入的float类型小数

            4.关闭
                sc.close();
                注意: 一定要在当前类中使用完毕Scanner之后再关闭,否则会 造成再当前类中再也无法使用

           练习:
            求三个值中最大的值,要求三个数通过用户键盘输入接受的

 */

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3.使用功能
       // int num = sc.nextInt();
        //System.out.println(num);


        /*
        System.out.println("请输入您的银行卡余额:");
        double d = sc.nextDouble();
        System.out.println("您的银行卡余额为:"+d);
        */


        //关闭
       // sc.close();

        System.out.println("请输入一个数：");
        int a = sc.nextInt();
        System.out.println("请输入一个数：");
        int b = sc.nextInt();
        System.out.println("请输入一个数：");
        int c = sc.nextInt();


        int max = a>b && a>c ? a : (b>c ? b : c);

        System.out.println(max);






    }
}
