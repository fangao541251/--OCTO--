package com.fangao.sc01.sc;

/*
    流程控制语句:
        顺序结构 : 从上到下  从左到右
        选择结构 : 满足条件执行某些代码
        循环结构 : 重复执行的代码

        选择结构:
            if...
            switch

        单选择| 单分支:
            满足条件就执行指定代码,不满足条件就不执行
            if(表达式){
                满足条件执行的代码;
            }
            执行流程:
                1.计算表达式,得到一个boolean类型的结果
                2.如果结果为true,执行{}中的 与具体
                3.如果结果为false,不执行{}中的语句体

        双选|双分支:
            if(条件表达式){
                满足条件执行的语句体1;
            }else{
                不满足条件执行的语句体2;
            }
            执行流程:
                1.计算表达式,得到一个boolean类型的结果
                2.如果结果为true,执行语句体1
                3.如果结果为false,执行语句体2


        多选择|多分支:
            if(条件表达式1){
                语句体1;
            }else if(条件2){
                语句体2;
            }else if(条件3){
                语句体3;
            }....
            else{
                以上条件都不满足,执行语句体n;
            }
            执行流程:
                1.计算表达式1,得到boolean结果
                2.如果结果为true,执行语句体1,如果结果为false,计算条件2
                3如果结果为true,执行语句体2,如果结果为false,计算条件3
                ....
                4.如果以上所有的条件都不满足 ,执行else中的语句体n

        注意:
            {}中的语句体只有一句,前后 的{}可以省略
            else可以根据需求自定义添加

        条件运算符与if语句的区别:
            都可以做添加判断
            条件运算符肯定会得到一个结果,但是if不一定
            条件运算符值1,值2都是确定的某一个值,if的{}可以为多个语句体
            如果简单的建议使用条件运算符,结构简单,如果复杂的建议使用if条件判断,结构清晰

 */



import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {

     /*
        int a = -5;

        //单选
        //判断a是否>0
        if(a>0) {
            System.out.println("a>0");
        }
        System.out.println("哈哈哈,测试是否被if语句控制");

        //双选
        String username = "张三";
        if(username == "张三丰"){
            System.out.println("用户名输入正确");
        }else{
            System.out.println("用户名输入错误");
        }

        //多选
        if(a>0)
            System.out.println("a>0");
        else if(a==0)
            System.out.println("a=0");
        else if(a<0)
            System.out.println("a<0");
       */




        //练习:
        // 一.判断一个 是是否为偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + "是偶数");
        } else {
            System.out.println(a + "是奇数");


            // 二.判断3个数中最大的值,3个数为随机生成[50~100]整数
            Random ran = new Random();
            int x = ran.nextInt(100-50+1)+50;
            int y = ran.nextInt(100-50+1)+50;
            int z = ran.nextInt(100-50+1)+50;

            System.out.println("x="+x+",y="+y+",z="+z);
            if(x>y  &&  x>z){
                System.out.println("x最大");
            }else if(y>z){
                System.out.println("y最大");
            }else{
                System.out.println("z最大");
            }

        /*
			三.键盘输入小明的一门成绩,显示该成绩对应的奖励
				100			爸爸给你买个iphone12promax
				[90,100)	爸爸给你买个iphone8
				[60,90)		别灰心,爸爸给你买各种学习资料
				(0,60)		买学习资料,上补习班,各种爱的教育,如果下次还不及格,小心皮鞭沾凉水
				0			我看你是快了!!!!
		*/
            Scanner su = new Scanner(System.in);
            System.out.println("请输入您的考试成绩:");
            int score = sc.nextInt();
            if(score==100){
                System.out.println("爸爸给你买个iphone12proMax");
            }else if(score>=90 && score<100){
                System.out.println("爸爸给你买个iphone12pro");
            }else if(score>=60 && score<90){
                System.out.println("别灰心,爸爸给你买各种学习资料");
            }else if(score>0 && score<60){
                System.out.println("买学习资料,上补习班,各种爱的教育,如果下次还不及格,小心皮鞭沾凉水");
            }else if(score==0){
                System.out.println("我看你是快了!!!!");
            }else{
                System.out.println("此分数不符合规定范围");
            }

        /*
			四.根据月份，输出对应的季节
				3~5  春天
				6~8  夏天
				9~11 秋天
				12~2 冬天
		 */
            System.out.println("请输入您要查询的月份:");
            int month = sc.nextInt();

            if(month>=3 && month<=5){
                System.out.println("春天");
            }else if(month>=6 && month<=8){
                System.out.println("夏天");
            }else if(month>=9 && month<=12){
                System.out.println("秋天");
            }else if(month ==12 || month==1 || month==2){
                System.out.println("冬季");
            }else{
                System.out.println("不满足条件");

            }
        }
    }
}

