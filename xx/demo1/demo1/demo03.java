package com.xx.demo1.demo1;

/*
    数据类型:
        java是强类型的语言

        基本数据类型: 4类8种
            整型
                类型名字            表现形式                大小              范围
                字节型               byte                  1byte = 8bit      [-128,127]
                短整型               short                 2byte = 16bit     [-32768,32767]  +-3万
             ***整型                  int                  4byte = 32bit      +-21亿
                长整型               long                  8byte = 64bit     非常大

                在java中整数的字面常量值默认int类型
                如果表示long类型的字面常量值的数据需要在数据的后面添加L|l  推荐使用大写
                如果为byte或者short类型赋值的时候,如果在其范围内的常量就可以直接赋值
            浮点型
                单精度             float           4个字节                 能够表示小数点后7位左右
             ***双精度             double          8个字节                 能够表示小数点后16位左右
                小数字面常量值在 java中默认数据类型为double
                float类型 的数据值需要在数据的后面添加f|F
                浮点类型在进行 运算的时候不精确

            字符型
                字符型         char            2byte
                    字符型的 表现形式:
                        1)'单个字符'表示字符型数据
                        2)通过0~65535之间的整数表示任意一个字符   对应Unicode字符集   一共65536个   去ASCII表中查询

            布尔型
                boolean   布尔类型     1bit   true|false


        引用数据类型: 类     接口     数组[]

        要求: 根据 逻辑需求自定义任意基本数据类型的数据
            1)会分析
            2)会定义

 */

public class demo03 {
    public static void main(String[] args) {
        //字节型
        byte b = 127;
        System.out.println(b);

        //短整型
        short s = 1;
        System.out.println(s);

        //整型
        int age = 18;
        System.out.println(age);

        //long
        long l = 11111111111L;

        //double
        double sal = 10000.1;
        System.out.println(sal);

        float f = 10000.1f;
        System.out.println(f);

        //字符
        char ch = ' ';
        char ch1 = '1';
        char ch2 = '好';
        char ch3 = '!';
        char ch4 = 97;  //a
        char ch5 = 65;  //A
        char ch6 = 65534;  //

        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println(ch6);

        //boolean
        boolean flag =false ;
        System.out.println(flag);
        flag =true ;
        System.out.println(flag);
    }
}

