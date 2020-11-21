package com.fangao.op01;

/*
    位运算符 (了解)
        运算的时候,会先把操作数转为二进制,然后进行运算,最终得到的结果转为十进制
        & : 二进制的两个操作数,统一位置的两个数如果一个为0就是0,两个都为1才是1
        | : 二进制的两个操作数,同一位置的两个数如果一个1就是1,两个都为0才是0
        ^ : 二进制的两个操作数,同一位置的两个数如果相等为0,不等为1
        以上两边操作数 为boolean类型 作为逻辑运算符使用,如果操作数为整数,作为位运算使用

        位移运算符
        << 左移 : 第一个操作数转为二进制,向左移动第二个操作数个位置,最终的结果转为十进制
        >> 右移 : 第一个操作数转为二进制,向右移动第二个操作数个位置,假设源操作数右边与一条线,移出的忽略,只保留剩下的二进制的数据,最终的结果转为十进制

        规律:
            右移: 第一个操作数/2^(第二个操作数次幂)
            左移: 第一个操作数*2^(第二个操作数次幂)

        总结: 位移运算符相对效率较高,直接针对于二进制进行操作
 */

public class opdemo05 {
    public static void main(String[] args) {

            System.out.println(2&3);  //2
            System.out.println(2|3);  //3
            System.out.println(2^3);  //1

            System.out.println(8>>2);  //2
            System.out.println(8<<2);  //32
            System.out.println(8<<3);  //64

        //练习题  自定义 a,b变量的值

        int a = 2;
        int b = 10;

        boolean x = a < b ? ++a * 2 > b || a > b : a < b;
        System.out.println(x);


    }
}
