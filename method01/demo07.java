package method01;


import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {

/*
  2)键盘输入一个年份，判断是平年还是闰年
		闰年：能被4整除但不能被100整除或者能被400整除
  3)输入年月日，判断这一天是该年的第几天，距离该年结束还有多少天
    1.键盘驶入接收年月日
    2.年->年多少天

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year = sc.nextInt();
        System.out.println("请输入一个月份:");
        int month = sc.nextInt();
        System.out.println("请输入一个日份:");
        int day = sc.nextInt();

        //所有月份的和
        int monthSum = 0;
        //计算今年到当前 也分之前的天数综合
        if (month >= 2 && month <= 12) {

            //i代表从1月开始,到当前月份-1之间的所有的每一个月
            for (int i = 1; i < month; i++) {
                switch (i) {  //case穿透
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        monthSum += 31;
                        break;
                    case 2:
                        if ("闰年".equals(checkYear(year))) {
                            monthSum += 29;
                        } else {
                            monthSum += 28;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        monthSum += 30;
                        break;
                }
            }
        }

        //今天是今年的第几天
        int sum = monthSum + day;
        System.out.println("今天是" + year + "年的第" + sum + "天");

        //距离该年结束还有多少天
        if ("闰年".equals(checkYear(year))) {
            System.out.println("距离该年结束还有" + (366 - sum) + "天");
        } else {
            System.out.println("距离该年结束还有" + (365 - sum) + "天");
        }
    }

    //接受一个年份，判断是平年还是闰年 闰年：能被4整除但不能被100整除或者能被400整除
    //返回值: String  参数:int year
    public static String checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return "闰年";
        } else {
            return "平年";
        }

    }
}

