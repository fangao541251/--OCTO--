package for02;

/*
    do ... while()
        do{
            循环体语句;
        }while(条件判断);

       while与do ... while的区别:
        while先判断后执行
        do ... while是先执行后判断
        无论是否满足条件都至少执行一次

      for 与 while与 do..while可以相互转换,推荐使用for和while
 */


public class demo04 {
    public static void main(String[] args) {
        boolean flag = false;
        while (flag){
            System.out.println("无法执行");
        }
        do {
            System.out.println("do...while");
        }while (flag);

        //计算1-10之间的和
        int sum = 0;
        int i = 1;
        do {
            sum+=i;
            i++;
        }while (i<=10);
        System.out.println(i);
        System.out.println(sum);
    }
}
