package com.xx.demo1.demo1;

/*
    变量: 可变的量
        在程序执行过程中,其值可以发生改变的量
        相当于造盒子   盒子就是变量  盒子的名字是变量名    盒子中存的内容 是变量的值
        变量的作用:  存储数据  存储单个数据
        变量就是: 在内存中开辟一个块内存 空间,用来存储对应类型的数据

        常用的数据类型: 整数int  小数double  字符char' '   布尔boolean   字符串""String

    语法:
        数据类型 变量名 = 变量值;     --声明的同时赋值
        数据类型 变量名 ;       --先声明一个变量
        变量名  = 赋值;        --后赋值

        等号是java中唯一一个自右向左运算的符号
        同时声明多个变量

        定义变量 的时候需要关注的点:
            1.数据类型
            2.变量名严格满足标识符的规则|规范
            3.数据值 与 数据类型保持一致
            4.作用域 : 能使用的范围 -->{}


        变量的分类:
            1.局部变量 : 定义在{}中的变量,方法,语句块..
                必须要先声明后赋值才能使用
            2.成员变量 : 类中方法外
                只声明不赋值存在默认值: 整数->0   小数 ->0.0  字符->' ' 布尔->false   字符串->null


 */


public class demo02 {
    //成员 类中方法外
    //成员变量
    int i ;

    public static void main(String[] args) {
        //声明的同时赋值
        //定义一个变量,存储学生姓名
        //把一个字面常量值"张三",赋值给了一个String类型的变量studentName
        String studentName = "张三";

        //定义一个变量,存储学生年龄
        int age = 19;

        System.out.println(studentName);
        System.out.println(age);


        //先声明后赋值
        char gender;
        //必须使用之前已经声明并且已经赋值 ,因为不存在默认值
        //System.out.println(gender);


        gender = '男';
        System.out.println(gender);
        //同时声明多个int类型的变量x y z
        int x,y,z;

        z=x=y= 10;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println(studentName);

    }


    public static void test(){
        String studentName = "李四";
        System.out.println(studentName);
    }
}

