package com.xx.demo1.demo2;

/*
    ++ --
    自增|自减
    ++ 自增
        自身 +1
        a++|++a  ==> a = a+1;
    -- 自减
        a--|--a ==> a = a-1;

    影响自己|操作自己
        ++写在操作数的前面|后面都是自身+1
        --写在操作数的前面还是后面都是自身-1

    影响别人|参与运算
        ++|--如果放在操作数的前面,先自身+1|-1,然后参与运算
        ++|--如果放在操作数的后面,先运算再-1|+1  a--
 */

public class demo08 {
    public static void main(String[] args) {
        int a = 3;
        //影响自己
        a++;  //a=a+1;
        System.out.println(a); //4
        ++a;
        System.out.println(a);  //5

        int b = 5;
        //影响自己
        --b;
        System.out.println(b); //4

        //影响别人
        //先拿b变量的值输出,然后b再自身-1
        System.out.println(b--);
        System.out.println(b);   //3

        //影响别人
        System.out.println(++a);  //6

        //影响别人 c的结果
        int c = --b+1;
        System.out.println(b);  //2
        System.out.println(c);  //3

        c = a++;

        System.out.println(a); //7
        System.out.println(c); //6

        int i= 2;
        int result = i++ + ++i + i++ + i++ + ++i;
        System.out.println(i);  //7
        System.out.println(result);  //22
    }
}
