package method01;

/*
    方法 的重载:  重写
        重要的特性
        同一个类中的多个方法,方法名相同,参数列表不同|方法签名不同

        同一个类中的多个方法
        方法名相同
        参数列表不同|方法签名不同
            参数个数不同
            参数的类型不同
            不同类型的参数顺序不同

        测试方法的重载跟方法的修饰符? 没有关系
        测试方法的重载跟方法的返回值类型? 没有关系
        测试方法的重载跟方法的参数的名字? 没有关系
        方法的重载只跟方法签名相同

        重载的方法的调用?
            根据实参决定



        一个类中方法的重载是多态的一种体现
        一个类中的方法就是封装的一种体现

        //练习: 计算不同图形的面积  长方形 正方形  圆形   梯形
        //封装一个99乘法表  某行乘法表


 */

public class demo05 {
    public static void main(String[] args) { {
        getSum(1,2.0);
    }

    }

    //求和
    //求2个int整数的和
    public static void getSum(int a,int b){
        System.out.println("求2个int整数的和");
        System.out.println(a+b);
    }

    //求3个int整数的和
    public static void getSum(int a,int b,int c){
        System.out.println("求3个int整数的和");
        System.out.println(a+b+c);
    }

    //求2个double整数的和
    //求3个double整数的和
    //求2个1个double,1个int整数的和
    public static void getSum(double a,int b){
        System.out.println("求2个1个double,1个int整数的和");
        System.out.println(a+b);
    }

    //求2个1个int,1个double整数的和
    public static void getSum(int b,double a){
        System.out.println("求2个1个int,1个double整数的和");
        System.out.println(a+b);
    }

}
