package com.xx.demo1.demo2;

/*
    运算符:
        算数运算符
        赋值运算符
        比较运算符
        逻辑运算符
        条件运算符
        位运算符

        操作数: 运算符左右两边的数据成为操作数
        表达式: 运算符连接左右两边的操作数整体称为表达式  a+b
        语句: 分号代表 语句 的结束

        一元|单目运算符 : 操作数只有一个运算符  + - 正号负号  ++ --
        二元|双目运算符 : 操作数有两个 + - * /
        三元|三目运算符 : 条件运算符

        算数运算符 重点(+字符串连接符  ++--)
            +
                1) 正号,可省略
                2) 加法运算
                3) 字符串的连接符使用
                    当+左右两边只要一旦出现字符串,+就作为字符串的连接符,把两边的内容拼接成为一整个字符串
            -
                1)负号
                2)减法运算
            *
                乘法运算
            /
                除法运算
            %
                取模|求余数
                规律: 当第一个 操作数小于第二个操作数的时候,结果为第一个操作数
            ++
            --

    字符型参与运算,先转为对应 的十进制的结果然后再运算
 */

public class demo07 {
    public static void main(String[] args) {
        int i = 3;
        //int j = 10;
        System.out.println(i);
        //System.out.println("j = "   +   j);  //"j = 10"

        System.out.println('a'+1+"hello");  // "98hello"
        System.out.println("hello"+'a'+1);  //"helloa1"

        System.out.println('a'-1);
        char ch  = 'a'-1;
        System.out.println(ch);

        System.out.println(3*5);
        //分母不能为0
        //System.out.println(3/0);

        System.out.println(3%5);  //3
        System.out.println(7%5);  //2


        //课后练习
        int k=20;
        int j=8;
        int totle = k++ + j-- + --j + ++k + k++ + j++ + k-- + --k + j++;
        System.out.println("k="+k+",j="+j+",totle="+totle);
    }

}
