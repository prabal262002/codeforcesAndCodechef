//package A20j;

import java.util.Scanner;

public class lifeWithoutZeroes {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       boolean flag = false;
       if(n%4==0) flag = true;
       else if(n%7==0) flag = true;
       else if(n%47==0) flag = true;
       else while(n>0){
           if(n%10==4 || n%10==7) flag = true;
           else {
               flag = false;
               break;
           }
           n/=10;
       }
       if(flag) System.out.println("YES");
       else System.out.println("NO");
    }
}
