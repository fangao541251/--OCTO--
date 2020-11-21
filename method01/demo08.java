package method01;

/*
    递归:(了解)
        自己调用自己

        递归前进段 : 从开始自己调用自己到临界条件,过程称为递归前进段
        递归后退段 : 从临界条件开始返回到上一层,过程称为递归后退段
        临界条件: 停止自己调用自己的条件

        递归头 : 临界条件
        递归体 : 自己 调用 自己

        //练习: 打印前几行乘法表 ->递归
 */

public class demo08 {
    public static void main(String[] args) {
        int result = rec(5);
        System.out.println(result);
    }

    //阶乘  5*4*3*2*1
    //封装: 计算某个数的阶乘  i
    //返回值: 需要 int   参数 : 要 int i
    private static int rec(int i) {
        //临界条件
        if (i==1){
            return 1;
        }
        //自己调用自己
        return i*rec(i-1);
    }

}





