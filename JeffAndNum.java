package A20j;

import java.util.Scanner;

public class JeffAndNum {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();
        int a = ac.nextInt();
        int b = ac.nextInt();
        a++;int count=0;
        while (b>=0 && a<=n){
            count++;
            a++;
            b--;
        }
        System.out.println(count);
    }
}
