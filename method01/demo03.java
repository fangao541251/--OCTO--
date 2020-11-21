package method01;

public class demo03 {
    public static void main(String[] args) {
        int area = getArea(5,7);
        System.out.println(area);
    }

    //求矩形的面积
    public static int getArea(int w,int h){
        return w*h;
    }
}
