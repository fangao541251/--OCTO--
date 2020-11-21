package com.xx.demo1.demo1;

/*
    数值型的表现形式:
        整型:
            二进制 :  由0,1组成       添加0B|0b开头             java7中新增二进制整数表现
            八进制 :  由0~7组成       添加0开头
            十进制 :  由0~9组成       默认表示
            十六进制 : 由0~9,a~f任意组合而成 不区分大小写                添加0x|0X开头

            转换: (了解)
                其他进制数据转为十进制:
                    从数据的最后一位开始,当前位置的数据*当前的进制数(次方从0开始,每次+1),继续+向左每一位置的数据*进制(...) ,最终结果为十进制表示数据
                十进制转为其他进制:
                    不停的使用当前数据除以要转为要转为的进制数,得到余数,从下往上,就是其他进制表示数据


        浮点型
            1) 如果整数位为0,零可以省略  0.15->.15
            2)  科学计数法  e->10
                    1.23E3 ->1.23*10^3 =1230
                    1.23E-3 ->1.23/10^3 =0.00123


        习题: 计算521转为2进制,8进制 16进制的结果
 */

import jdk.swing.interop.SwingInterOpUtils;

public class demo04 {
    public static void main(String[] args) {
        //二进制
        System.out.println(0B1010);  //0*2^0 + 1*2^1 + 0*2^2 +1*2^3 = 10
        //八进制
        System.out.println(0123);  //3*8^0 + 2*8^1 + 1*8^2 = 83
        //十六进制
        System.out.println(0xF);

        System.out.println(0b1100);
        System.out.println(014);

        //浮点
        System.out.println(0.15);
        System.out.println(.15);

        //科学计数法
        System.out.println(1.23E3);
        System.out.println(1.23E-3);

        //习题: 计算521转为2进制,8进制 16进制的结果
        System.out.println(0B1000001001);//二进制
        System.out.println(01011);//八进制
        System.out.println(0x209);//十六进制



    }
}
