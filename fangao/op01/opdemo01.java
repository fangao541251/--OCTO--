package com.fangao.op01;

/*
    算数运算符: +
    ++--  自增自减

    赋值运算符:
        基础赋值运算符
            =
            双目运算符
            是java中唯一一个自右向左运算的符号

        扩展赋值运算符(基础赋值运算符+算数运算符)
            += -= *= /= %=
            a+=1;  =>a=a+1;
            a%=1;  =>a=a%1;

            推荐使用
            优点:
                执行效率高
                编译器会在编译的时候自动优化成扩展赋值运算符,提高效率
                自动做强制类型转换
            缺点: 不够直观

 */

public class opdemo01 {
    public static void main(String[] args) {
        int age = 5;

        System.out.println(age);
        age+=10;
        age++;
        System.out.println(age);

        //计算班级所有同学的年龄和
        int total = 0;
        total+=18;//total = total+18;
        total+=20;//total = total+20;

        //省略强制类型转换
        short s = 100;
        //s = s+1;
        s+=1;
        s++;


    }
}
