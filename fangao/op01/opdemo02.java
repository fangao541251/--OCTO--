package com.fangao.op01;

/*
    比较运算符|关系运算符
        > < >= <=
            操作数类型: byte,short,int,long,float,double,char

        == !=
            操作数: 任意类型(基本数据类型,引用数据类型)

        结果为boolean类型的数值
 */

public class opdemo02 {
    public static void main(String[] args) {
        char ch = 'a';

        System.out.println(ch>=97);

        String str = "zhangsan";
        boolean flag = false;

        System.out.println(str!="zhangsan"!=flag);
        System.out.println(ch+5=='f');
        System.out.println((int)'f');



        //练习
        double d=10/3;
        int a=10/3;
        System.out.println(a==d);    //
        System.out.println(a);    //
        System.out.println(d);    //

        d=10/3.0;
        a=10/3;
        System.out.println(a==d);    //
        System.out.println(a);    //
        System.out.println(d);    //

    }
}


