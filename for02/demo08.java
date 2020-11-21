package for02;

/*
    break,continue 在多重循环嵌套下,针对内层循环,还是最外层
        --> 默认控制内层循环,当前我所在的这个循环
    如果想要终止|调出的是所有的循环(外层循环)--->带标签的break|continue
        为循环添加标签,在开始位置,可以直接跳转达到对应标志位置
 */


import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        haha:
        for (int i=1;i<=5;i++){
            for (int j=1;j<=3;j++){
                System.out.println("i=\"+i+\"----->j=\"+j+\"\\t");

                if (j==2){
                    break haha;
                }
            }
            System.out.println();
        }




      /*  输入课程代号,输出对应的课程的名称,用户可以循环进入输入,如果输入1就继续,输入0则退出.
        1---Java课程
        2---大数据课程
        3---Python课程
        4---前端课程
        其他数字---没有这门课程
        分析:
        键盘录入: Scanner
                switch语句判断对应的课程名称
        询问用户是否继续:1继续,2退出
       */

        Scanner SC = new Scanner(System.in);

        String key = "";
        System.out.println("输入0结束程序");
        do {
            System.out.println("请选择课程编号" + "1 2 3 4");
            key = SC.next();
            if (key.equals("1")) {
                System.out.println("Java课程");
            }
            if (key.equals("2")) {
                System.out.println("大数据课程");
            }
            if (key.equals("3")) {
                System.out.println("Python课程");
            }
            if (key.equals("4")) {
                System.out.println("前端课程");
            }

            if (key.equals("0")) {

                System.out.println("谢谢使用");
                break;
            }

        } while (true);






    }
}
