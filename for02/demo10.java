package for02;

/*
    1.交换两个变量的值  int a = 1;int b=10000;
        1)临时变量  int temp = a;  a=b;  b=temp;
        2)求和
        3)通过抑或^

    2.有一个变量 int num = 987; 得到这个数字每一个位数的值
        num/100=百位数
        num%100/10 = 十位数
        mu,%100%10 = 个位数

 */


public class demo10 {

    public static void main(String[] args) {

        //1)临时变量
        int a = 1;
        int b=10000;
        /*int temp = a;
        a=b;
        b=temp;
        System.out.println(a); //10000
        System.out.println(b);  //1*/

        //2) 求和
        a = a+b;  //10001
        b= a-b;
        a= a-b;
        System.out.println(a); //10000
        System.out.println(b); //1

    }
}
