package method01;

import java.util.Scanner;
//解决方案: 比较字符串的内容是否相等,字符串1.equals(字符串2)=>true|false!!!!!!!
public class demo06 {
    public static void main(String[] args) {
        //接收用户输入的用户名与密码,对用户名与密码进行判定,如果名字为laopei,密码为1234,登录成功,否则输出用户名或者密码错误
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名 :");
        String name = sc.next();
        System.out.println("请输入密码 :");
        String pwd = sc.next();

        System.out.println(name+"-->"+pwd);

        //对 已经接受的用户名和密码进行判断
        if(check(name,pwd)){
            System.out.println("登录成功!!!恭喜!!!");
        }else{
            System.out.println("用户名或者密码错误");
        }


        //解决方案: 比较字符串的内容是否相等,字符串1.equals(字符串2)=>true|false
        System.out.println(name.equals("zhangsan"));
        System.out.println("zhangsan".equals(name));

    }

    //封装一个对应用户和密码进行校验的功能   用户名:laopei   密码:1234
    //返回值: boolean  参数:2个 String username,String password    方法名: check
    public static  boolean check( String username,String password){
        if("laopei".equals(username) && "1234".equals(password)){
            return true;
        }
        return false;
    }
}