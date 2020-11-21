package com.fangao.sc01.sc;

/*
    switch 语句
        定值判断

    语法:
        switch(表达式){
            case 值1:
                语句体1;
                break;
            case 值2:
                语句体2;
                break;
            ...
            default:
                语句体n;
                break;
        }
        表达式: 一般一个变量,可以为一个表达式
            结果的数据类型要求: byte,short,int,char,枚举(jdk1.5新增),String(jdk1.7)
        case: case的值与表达式的结果进行判断是否相等
        break: 结果当前switch语句,防止case穿透
        default: 相当于if语句的else
            default为值可以任意改变

    执行流程:
        1.计算表达式()
        2.从上到下使用case后的值与表达式的结果进行判断,是否 相等,相等就执行对应的语句体,不相等继续向下判断
        3.如果执行了对应的语句体之后,break就结束|终止switch
        4.如果以上的所有的case后的值都不相等,执行default后的内容

     注意:
        case穿透: 如果一旦满足 条件执行对应的 语句体了,没有break,会发生case穿透,无论下面的case是否满足条件,都会执行语句体,知道遇到下一个break或者switch语句的结束

        switch与if的区别:
           switch 定值判断
           if 定值判断| 区间判断
 */

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {

        String flag  = "绿灯";
        switch (flag){
            default:
                System.out.println("你去死吧!!!!");
                break;
            case "红灯":
                System.out.println("红灯停...");
                break;
            case "绿灯":
                System.out.println("绿灯行...");
                break;
            case "黄灯":
                System.out.println("黄灯等一等...");
                break;

        }

        //case穿透
        /*switch (flag){
            case "红灯":
                System.out.println("红灯停...");
            case "绿灯":
                System.out.println("绿灯行...");
            case "黄灯":
                System.out.println("黄灯等一等...");
            default:
                System.out.println("你去死吧!!!!");
        }*/

        //测试()中数据的类型
        int i = 10;
        switch((byte)(i*10)){
            case '1':
                System.out.println("1");
                break;
            case 10:
                System.out.println("10");
                break;
            case 100:
                System.out.println("100");
                break;



        }
    }

    //练习: 把刚刚判断季节练习题使用switch写


    }







