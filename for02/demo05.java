package for02;

/*
    break
        作用: 终止 ,停止
        应用场景:  switch语句  循环语句

    continue
        作用:  停止当前这一次 循环的执行,直接进入到下一次循环
        应用场景: 循环中

 */


public class demo05 {
    public static void main(String[] args) {
        //打印1~10之间的数据,当4,6的跳过
        for (int i=1;i<=10;i++){
            if(i==4 || i==6){
                continue;
            }
            System.out.println(i);
        }
        //死循环 配合break关键字一起使用,可以存在终止机会
        int j = 1;
        while (true){
            if(j==5){
                break;
            }
            j++;
        }
        System.out.println(123);

        //1~10之间能被3整除的前2个数
        int count = 0;
        for (int i = 1;i<=10;i++){
            if(i%3==0){
                System.out.println(i);
                count++;
                if (count==2){
                    break;
                }
            }
        }
    }
}
