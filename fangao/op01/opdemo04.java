package com.fangao.op01;

/*
    条件运算符|三目运算符|三元运算符

        语法:
            boolean类型表达式 ? 值1 : 值2;

        执行流程:
            1.执行条件表达式,得到一个boolean类型的结果
            2.结果为true,最终的结果为值1
            3.结果为false,最终的结果为值2
 */

public class opdemo04 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 4;
        //比较2个数 中的最大de值
        int max = a>b ? a : b;
        System.out.println(max);

        // 比较两个变量的大小,找到值最大的那个变量的变量名
        String str = a>b ? "a最大" : "b最大";
        System.out.println(str);

        //计算a是否为偶数
        System.out.println(a%2 == 0 ? "偶数" : "奇数");;


        //练习:
        //1.计算某个变量是否为计数
        str = a%2 !=0 ? "奇数" : "偶数";
        System.out.println(str);


        //2.如果有3个变量,求三个变量中的最大值
        max = a>b ? a : b;
        max = max>c ? max : c;
        System.out.println(max);

        max = a>b && a>c ? a : (b>c ? b : c);
        System.out.println(max);




    }
}
