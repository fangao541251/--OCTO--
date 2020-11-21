package method01;

//练习: 打印前几行乘法表 ->递归

public class demo09 {
    public static void main(String[] args) {
        printpad(7);


    }

    private static void printpad(int x) {
        //递归头

        if (x == 1){
            System.out.println("1*1=1");
            return;
        }
        printpad(x-1);
        //第x行

        for (int i =1;i<=x;i++){
            System.out.print(i+"*"+x+"="+i*x+"\t");

        }
        System.out.println();

    }
}
