package for02;/*
    方法:  解决事情的办法
        封装功能的

    要求:
            类中方法外,方法不能嵌套
            方法不调用不执行

    定义:
        有返回值类型的方法
            修饰符 返回值类型 方法名(参数列表){
                方法体
                return 返回值;
            }

            修饰符: 访问权限修饰符 ->public static 默认
            返回值类型: 数据类型: 基本|引用
                分析: 在方法执行完毕之后,是否要得到一个值|结果,如果需要定义成有返回值,不需要定义成没有返回值类型的方法
                配合方法体中return关键字一起使用,返回一个值给方法的调用处
                返回值类型: return后面数据的类型
            方法名: 标识符,遵循标识符的命名规范|规则
            (参数列表) : 可以定义参数,可以不定义参数,可以定义多个参数
                分析: 定义方法的时候,是否有某些数据是未知的,不确定的,可变的,定义在方法的参数列表上
                    参数:相当于局部变量的声明  (数据类型 参数名,数据类型 参数名,数据类型 参数名....)
            方法体: 实现功能的具体代码段;
            注意: 如果是有返回值类型的方法,必须使用 return关键字返回结果

        没有返回值类型的方法
            修饰符 void 方法名(参数列表){
                方法体
            }


       定义方法分析步骤:
        1.需求:返回一个PI的值
        2.返回值:需要  double
        3.参数: 没有
        4.方法名: getPI()


        方法的调用: 执行方法中的代码
            方法名(参数);

            有返回值类型的方法:
                1.输出调用   System.out.printn(方法名(参数));
                2.赋值调用   数据类型 变量名 = 方法名(参数);
                3.普通调用  不推荐,有返回值类型的方法,不接受返回值没意义

 */



public class demo09 {
    public static void main(String[] args) {
        //调用
        //getPI();
        //输出调用

        System.out.println(getPI());

        //赋值调用
        double d = getPI();
        System.out.println(d);

        System.out.println(getSum(5,7));
        System.out.println(getSum(1,2));
        System.out.println(getSum(123,456));

    }

    //需求:返回一个PI的值
    //返回值:需要  double
    //参数: 没有
    //方法名: getPI()
    //没有参数有返回值的方法

    private static double getPI() {
        System.out.println("没有参数有返回值的方法getPI");
        return 3.1415926;
    }


    //需求: 求2个整数的和
    //1.方法名 getSum()
    //2.返回值 int
    //3.参数 int x,int y
    //有返回值,有参数的方法
    private static int getSum(int x, int y) {
        System.out.println("有返回值,有参数的方法getSum");
        return x+y;
    }


    //练习:
    //1.比较2个数是否相等

    public static int getd(int x,int y){
        String S = x == y? "相等":"不相等";
        System.out.println(S);
        return x;
    }







    //2.比较求两个数中最大的值
    public static int getmax(int x,int y){
        if(x > y){
            System.out.println("x最大,为：" + x);
        }else {
            System.out.println("y最大,为：" + y);
        }
        return x;
    }

}
