//package A20j;

import java.util.Scanner;

public class smallElephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long min=Integer.MAX_VALUE;
        int index = 0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            if(arr[i]<min ) {min=arr[i];
            index=i;}
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==min) count++;
        }
        if(count>1) System.out.println("Still Rozdil");
        else System.out.println(index+1);
    }
}
