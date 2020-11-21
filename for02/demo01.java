package for02;

/*
    循环语句:
        重复做某件事

        for 循环              *****
        while 循环            ****
        do..while 循环        了解

        语法:
            for(条件初始化;条件判断;条件变化){
                重复执行的代码;
            }
            条件初始化: 声明一个变量并且赋值 int i = 1;
            条件判断 : 对变量i的判断,决定循环体{}重的代码是否能够执行,决定循环是否结束
            条件变化: i自身值得改变

            执行流程:
                1.条件初始化,声明一个变量并且赋值 i
                2.条件判断,判断i条件是否满足要求,得到一个boolean结果
                3.如果结果为false,结束循环结构,如果结果为true,执行当前这一次循环体{}中的语句
                4.条件变化 i变量自身值得改变,如果i永远不变,要不无法进入循环,要不循环无法停止
                重复执行第2~4步

           注意:
            循环中 的条件i,不仅可以通过数值范围变量方式控制循环体执行的次数,还可以在循环体中使用,可变,根据定义的规律改变
            循环体语句中只有一句的时候,前后的{}可以省略
 */

public class demo01 {
    public static void main(String[] args) throws InterruptedException {
         /* System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");
        System.out.println("安红,我想你想的睡不着觉!!!");*/

        //重复打印10次
  /*
        for(int i = 1;i<=100;i++){
            System.out.println("安红,我想你想的睡不着觉!!!"+i);
            //当变量为50的时候,程序停止10s
            if(i==50){
                System.out.println("中场休息十秒钟");
                Thread.sleep(10000);
            }
        }
*/


        //循环的条件 i的作用域: 只在当前定义的循环中
        //System.out.println(i);

        //计算1+2+3+4的值
        //重复求和  求和的数字有规律


 /*       int sum = 0;

        for(int i=1;i<=10;i+=1)
            sum = sum+i;

        System.out.println("和为"+sum);
*/

        //求1-100的和,求1-100的偶数和,求1-100的奇数和

        int sum = 0;
        /*
        for (int i=1;i<=100;i+=1){
            sum = sum+i;
            System.out.println(sum);
        }
*/

        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum_2 = sum_2 + i;
            } else {
                sum_1 = sum_1 + i;
            }
            System.out.println("偶数和为" + sum_2);
            System.out.println("奇数和为" + sum_1);

        }

        sum=0;
        //1-50当中能被4整除的数的和
        for(int i=1;i<=50;i++){
            if(i%4==0){
                sum+=i;
            }
        }


        sum=0;
        //求出 1-100当中既能被3整除又能被5整除还能被2整除的和，
        for(int i=1;i<=100;i++){
            if(i%2==0 && i%3==0 && i%5==0){
                sum+=i;
            }
        }


        //求出 1-100当中能被3整除或者能被5整除或者能被2整除的和
        for(int i=1;i<=100;i++){
            if(i%2==0 || i%3==0 || i%5==0){
                sum+=i;
            }
        }

        //求5的阶乘  5! 5*4*3*2*1
        int result = 1;
        for(int i=5;i>0;i--){
            result*=i;
        }


        //请找出[100，300]之间能被5整除的所有数，每行输出8个数
        int count = 0; //计数器
        for(int i=100;i<=300;i++){
            //能被5整除
            if(i%5==0){
                System.out.print(i+" ");
                count++;
				/*if(count == 8){
					System.out.println();  //换行
					count = 0;  //计数器归零
				}*/
                if(count%8==0){
                    System.out.println();                }
            }
        }
    }
}
