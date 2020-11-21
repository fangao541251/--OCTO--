package method01;

/*
    有返回值类型的方法
        修饰符 返回值类型 方法名(参数列表){
            实现功能的语句体;
            return 返回值;
        }

        有返回值类型的方法 :
            必须配合return一起使用,把返回值返回给方法的调用出

    没有返回值类型的方法
        修饰符 void 方法名(参数列表){
            实现功能的语句体;
            [return];
        }
        方法体重可以定义return关键字 ,但是return后面不能带出返回值的,作用只有提前结束方法
        void : 标识没有返回值
        调用:
            只能使用普通调用
            不能使用赋值|输出调用,因为没有返回值

        return:
            1) 提前结束方法
            2) 带出返回值

        参数:
            形式参数(形参) : 定义方法时()中的参数  : 局部变量的声明
            实际参数(实参) : 调用方法时()中的数据  : 局部变量的赋值
            形参和实参类型,个数,顺序必须一一对应

       局部变量使用前必须已经声明并且已经赋值
       形参不赋值没有默认值
       返回值不存在默认值
 */



public class demo01 {
    public static void main(String[] args) {
        System.out.println(getMax(3,1));


        //普通调用
        printStar();

        //输出调用
        //System.out.println(printStar());
        //赋值调用

        System.out.println("-------");
        printStar2(3,5);

    }

    //打印5行5列的星星
    //返回值: 不需要
    //参数: 不需要
    //方法名: printStar
    //没有返回值没有参数的方法

    public static void  printStar(){
        for (int i = 1;i<=5;i++){
            for (int j = 1 ;j<=5;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
    //定义打印某行某列的星星的方法
    //返回值: 不需要
    //参数: int x,int y
    //方法名printStar2()

    public static void printStar2(int x,int y){
        if (x==0 || y==0){
            System.out.println("xxxxxx");
            return;
        }
        for (int i = 1;i<=x;i++){
            for (int j = 1;j<=x;j++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
    public static int getMax(int x, int y){
        if (x>y){
            return x;
        }
        System.out.println();
        return y;
    }

}


//练习:
// 输出m行乘法表

// 计算某个范围内所有整数的和
