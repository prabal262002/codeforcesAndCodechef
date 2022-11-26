import java.util.*;
public class A_SSeeeeiinngg_DDoouubbllee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String S = sc.next();
            StringBuffer st = new StringBuffer(S);
            String h = st.reverse().toString();
            System.out.println(S+h);
        }
}
}