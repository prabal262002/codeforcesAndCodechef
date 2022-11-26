package A20j;

import java.util.Scanner;

public class ATranslation {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int low=0,high=S.length()-1;
        boolean flag = true;
        while(low<=high){
            if(S.charAt(low++)!=T.charAt(high--)){
                flag = false;
                break;
            }
        }
        if(!flag)        System.out.println("NO");
        System.out.println("YES");
        return 0;
    }
}
