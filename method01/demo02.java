package method01;

public class demo02 {
    public static void main(String[] args) {
        print(5);
        getSum(1,1);
    }
    // 输出m行乘法表
    //分析:
    //返回值: 不需要
    //参数 : int n
    //print
    public static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

    // 计算某个范围内所有整数的和
    //返回值: int
    //参数: int min,int max
    //getSum
    public static void getSum(int min,int max){
        if(min>max){
            System.out.println("第一个参数要求小于等于第二个参数");
            return;
        }
        int sum = 0;
        for(int i=min;i<=max;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
