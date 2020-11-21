package com.xx.demo1.demo1;
/*
    常量: 变量
        在java程序执行过程中,其值不会发生改变的量就是常量


    分类:
        字面值常量 :   写到字面上的一个数值,不会发生改变的确切的值,成为字面值常量
            整数常量 :  100 1  -1 0
            小数常量 : 0.1  -0.5
            字符常量 : ' '  '1'  '喊' ','
            字符串常量 : " "  ""  "sjflsjd"
            布尔常量 : false true
            空常量 : null

        自定义常量:
            被final修饰的变量为常量
            注意: 符合标识符的命名规范,驼峰命名原则 常量全部大写,多个单词之间_连接



 */


public class demo01 {
    public static void main(String[] args) {
        final int AGE =18;

        System.out.println(AGE);

        System.out.println(Math.PI);

        System.out.println(Thread.MAX_PRIORITY);
    }
}
