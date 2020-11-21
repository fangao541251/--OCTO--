package for02;

/*
    循环嵌套:
        循环中定义循环
        可以中自定义嵌套,但是使用最多的情况是for循环嵌套

        for(;;){
            代码;
            for(;;){
                代码;
            }
            代码;
        }
 */


import method01.demo02;

public class demo07 {

    public static void main(String[] args) {

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        //条件i作为星星个数
        /*int count = 0; //计数器
        for(int i=1;i<=25;i++){
            System.out.print("* ");
            count++;
            if(count==5){
                System.out.println(); //换行
                count = 0;
            }
        }*/

        //双重循环嵌套  i一个控制行   j一个控制列

        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.println("* ");

            }
            System.out.println();//换行
        }

        /*
         * * * * *
         *       *
         *       *
         *       *
         * * * * *
         */

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i==1 || i==5 || j==1 || j==5){
                    System.out.println("* ");
                }else {
                    System.out.println();//换行
                }
            }
        }

        System.out.println("--------------------------------------------");
        //打印七行六列的星星
        for(int i=1;i<=7;i++){
            for(int j=1;j<=6;j++){
                System.out.print("* ");
            }
            System.out.println();  //换行
        }
        //空心的七行六列的星星
        for(int i=1;i<=7;i++){
            for(int j=1;j<=6;j++){
                if(i==1 || i==7 || j==1 || j==6){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();  //换行
        }
        System.out.println("--------------------------------------------");

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         *
         * *
         *   *
         *     *
         * * * * *
         */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==5){
                    System.out.print("h ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        //九九乘法表

        // 打印99乘法表


        System.out.println("------------------");


        /*
         输出下列数值列表
          1    10	100    1000
          2    20	200    2000
          3    30	300    3000
          4    40	400    4000
          5    50	500    5000
      */

        for(int i=1;i<=5;i++){
            for(int j=1;j<=1000;j*=10){
                System.out.print(i*j+"  ");
            }
            System.out.println();
        }


    }

}
