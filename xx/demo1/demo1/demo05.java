package com.xx.demo1.demo1;

/*
    转义字符:
        有一些字符,在java中具有特殊含义,如果想要这些字符只代表字符本身,可以使用转义字符 "
        转义字符从\开始  \+要转义的字符

        \b 退格 光标往前会一格 ,删除一个内容
     *  \t 制表符  一个制表符位代表8个空格 如果前面的内容满制表符位的整数倍,重新开辟一个制表符位,如果不满那就布满一整个制表符位
                一个字母,数字,符号占一个空格位,一个汉字占2个空格位
     *  \n 换行
        \r 光标回到行首
            \r之后如果没有内容,源字符串内容影响,如果\r后面存在字符,之前清空
 */

public class demo05 {
    public static void main(String[] args) {
        System.out.println("深刻理解地方就\"电视剧弗兰克");
        System.out.println('\'');
        System.out.println("\\");

        System.out.println("你好么?\n我很好!");
        System.out.println("你好么?\t我很好!");
        System.out.println("shsxt\t我很好!");
        System.out.println("shsxtsxt\t我很好!");


        System.out.println("shsxtsxt我很好!\r");
        System.out.println("shsxtsxt\r我");

        System.out.println("欢迎来到我的网站:\n\t查看相册请输入1\n\t查询心情请输入2\n...");

        System.out.println("欢迎来到我的网站:");
        System.out.println("\t查看相册请输入1");
        System.out.println("\t查询心情请输入2");
    }
}
