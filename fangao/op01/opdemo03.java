package com.fangao.op01;

/*
    逻辑运算符:
        & 与
            两边的操作数都为true,结果为true,如果一个false,结果就为false
        | 或
            一个为true就是true,两个都为false才是false
        ! 非->取反
            !true->false
            !false->true

       短路运算符
            && : 与&逻辑相同
            || : 与|逻辑相同
            如果左边的操作数就能够决定最终的结果,右边得操作数不运行


        操作数只能为boolean类型,可以结果为boolean类型的表达式
        推荐使用短路运算符  && ||
 */

public class opdemo03 {
    public static void main(String[] args) {

        System.out.println("---------&----------------");
        System.out.println(true && true);  //true
        System.out.println(true & false); //false
        System.out.println(false & false);//false
        System.out.println(false & true);//false

        System.out.println("---------|----------------");
        System.out.println(true || true);  //true
        System.out.println(true | false); //true
        System.out.println(false | false);//false
        System.out.println(false | true);//true

        System.out.println("---------!----------------");
        System.out.println(!true);  //false
        System.out.println(!false); //true

        System.out.println(5+3>7 | 5+4<6);

        System.out.println("---------短路----------------");
        //ArithmeticException: / by zero 数学异常
        //System.out.println(false & 5/0==0);  //true
        System.out.println(false && 5/0==0);  //true



        System.out.println("=============练习=================");
        int a=10;
        int b=9;
        System.out.println(a>b & ++b>a);  //false
        System.out.println("a="+a+",b="+b);  //a=10,b=10
        System.out.println(a<b | b<a);    //true
        System.out.println(!(a>b ^ a>9)); //false
        System.out.println(10<5 & 10/0==0); //异常
        System.out.println(10<5 && 10/0==0); //false

    }
}
