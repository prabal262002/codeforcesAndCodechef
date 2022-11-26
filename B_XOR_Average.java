import java.util.*;
public class B_XOR_Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            if((n&1)==0){
                
                for (int i = 0; i < n-2; i++) {
                    System.out.print(2+" ");
                }
                 System.out.print("1 3");   
            }
            else {
                for (int i = 0; i < n; i++) {
                    System.out.print(9+" ");
                }
            }
            System.out.println();
        }
}
}