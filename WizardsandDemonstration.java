package A20j;

import java.util.Scanner;

public class WizardsandDemonstration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = (int) Math.ceil((double) n*y/100);
        if(p>x)System.out.println(p-x);
        else System.out.println(0);
    }
}
