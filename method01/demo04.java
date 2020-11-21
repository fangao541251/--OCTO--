package method01;

/*
    return 关键字
        1) 提前结束方法  2)带出返回值

    不可达语句:
            1.会执行的return后面出现的语句
            2.死循环后面的代码
            3.while(false){不可达;}
            4.会执行的break后的代码
            5.会执行continue后的代码

     方法签名: 标识方法的唯一
        方法名+参数列表

     兼容类型:
        参数类型 :  实参类型<=形参类型
        返回值数据的类型 :  return后数据的类型<=方法的返回值类型<=接受返回值的变量类型

     定义方法时候需要注意:
        1.方法中不能定义方法
        2.方法的形参与实参要一一对应
        3.返回值数据的类型要统一
        4.方法名要见名知意,标识符的规范
        5.形参没有默认值,在调用的时候才有值,由实参决定的
        6.方法的参数 是只属于方法的

     思考问题: 一个方法内部的局部变量,如果在外部使用
 */

public class demo04 {
    public static void main(String[] args) {
        long i = test(5);
    }

    public static long test(int i){
        if(i==5){
            return 'a';
            //System.out.println("不可达");
        }
        System.out.println("hhhhhhhh"+i);
        while(true){
            break;
            //System.out.println("不可达");
        }
        return 0;
    }
}
