package com.fangao.sc01.sc;

/*
    键盘输入
        接受字符串的功能:
            next()
                从有效字符开始接收,非空格字符,不能包含空格,一旦遇到空格就不再接收,但是 功能还没结束,enter才能结束功能
            nextLine()
                接收用户输入的一整行的内容,包含空格


 */

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {

        //1.导包
        //2.创建Scanner类型的引用
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名:");
        //3.根据引用数据功能
        String str = sc.next();
        System.out.println(str);

        //处理遗留enter
        sc.nextLine();

        System.out.println("下面测试nextLine()");
        String s = sc.nextLine();
        System.out.println(s);

        sc.close();


    }
}
