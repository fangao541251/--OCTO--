package com.xx.demo1.demo1;

/*
    数据类型转换:
        1.boolean类型不参与类型转换
        2.
            自动类型提升
                 大范围类型的变量 变量名 = 小范围类型的数据;

                 注意: 参数计算的数据的数据类型存在多种,结果的数据类型 会提升成为参与运算中的最大的数据类型
                       如果参与运算的数据类型为short,byte,char,最终的结果提升成为int类型
                       如果为byte,short,char类型赋值的时候,如果数据在其范围内常量就能够成功赋值
            强制类型转换
                小范围类型变量 变量名 = (小范围类型变量)大范围类型的数据;
                    1)先把数据强转为对应类型
                    2)对应类型的数据赋值给对应类型的变量

            byte short int long float double
 */

public class demo06 {
    public static void main(String[] args) {
        byte b1 = 1;

        System.out.println(b1);

        //自动类型提升
        short s1 = b1;
        int i1 = s1;
        long l1 = i1+s1;
        //等号右边结果数据的类型为long,long类型的数据赋值给double类型的变量
        double d1 = l1+s1+i1+b1;
        float f1 = l1;

        //b1+s1结果为int类型
        int i2 = b1+s1;

        //自定义常量,变量不行,变量的值有可能改变成为超出范围的值
        final int i = 100;
        byte b2 = i;

        //等号右边计算结果为int,赋值给等号左边的short不行
        //short s2 = b1+1;

        //强转
        short s3 = (short)i1;
        System.out.println(s3);

        //取整
        double d2 = 3.9;
        int i3 = (int)d2;
        System.out.println(i3);

        short by1 = (short)128;
        System.out.println(by1); //-128

        //圆环形状计算结果
        byte by2 = (byte)(by1-5);
        System.out.println(by2);

        //计算年薪  月薪*12
        int sal = 10000;
        long result = (long)sal*12l;
        System.out.println(result);
    }
}
