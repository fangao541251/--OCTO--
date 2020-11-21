package for02;

/*
    随机生成5个[1,36]之间的整数作为彩票中奖号码,对生成的数进行判断,不能有重复号码
    如果出现重复,需要重新生成
    提示:
        比如生成a1,a2,a3,a4,a5五个数字
        a2不能和a1相同
        a3不能和a1和a2相同
        a4不能和a1,a2,a3相同
        a4不能和a1,a2,a3,a4相同
        如果相同则重新生成
*/

import java.util.Random;

public class demo06 {
    public static void main(String[] args) {
        Random ran =new Random();
        int[] cp = new int[5];
        System.out.println("23选5（1~23）开奖：");
        int x=0;

        for(int i=0;i<5;i++){//开始抽奖 i是抽奖的次数
            x = ran.nextInt(23)+1;	//随机一个数字

            for(int e:cp){          //遍历数组检查是否有相同的
                if(e==x){
                    i--;			//相同，重新给cp[i]赋值;
                }
            }
            cp[i]= x;
        }

        for(int e:cp){
            System.out.print(e+"  ");

    }
}
}
