//package A20j;

import java.util.Scanner;

public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }
        int current=1;long count=0;
        for (int i = 0; i < m; i++) {
            if(arr[i]>=current) {
                count+=arr[i]-current;
            }
            else {
//                count+=n-current+1;
//                count+=arr[i]-1;
//                Or In short form>>>>>
                count+=n-current+arr[i];
            }
                current=arr[i];
        }
        System.out.println(count);
    }
}
