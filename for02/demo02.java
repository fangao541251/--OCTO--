package for02;

/**
 * while 循环
 *  for 次数循环
 *  while 条件循环
 *
 *  语法:
 *      while(条件判断){
 *          重复执行的语句体;
 *      }
 */

public class demo02 {
    public static void main(String[] args) {
        //打印十次 安红我想你想的想睡觉
        for(int i=1;i<=10;i++){
            System.out.println("安红我想你想的想睡觉");
        }

        int i=1; //条件初始化
        while(i<=10){
            System.out.println("安红我想你想的想睡觉");
            i++; //条件变化
        }

        //1~10的和
        int sum = 0;
        i = 1;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println(sum);


        //欺骗编译器
        boolean flag = false;
        while(flag){
            System.out.println("hahaha");
        }

        //System.out.println("1234567");  //不可达语句
    }
}
