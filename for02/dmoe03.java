package for02;

public class dmoe03 {
    public static void main(String[] args) {

        /*
        int sum = 0;
        int i = 1;
            sum+=i;
        while (i<=50){
            if (i%5==0)
            System.out.println();
            i++;
        }
*/

        int sum = 0;
        int i = 1;
        while (i<=100){
            if (i%2==0 && i%3==0 && i%5==0){
                System.out.println(sum+=i);
                i++;
            }
        }

    }
}
