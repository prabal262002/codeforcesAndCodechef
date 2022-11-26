import java.util.*;
import java.io.*;
public class C_Rock_and_Lever
{
public static void main(String[] args) {
var sc = new Kattio(System.in, System.out);
int t = sc.nextInt();
for (int i = 0; i < t; i++) solve(sc);
sc.close();
}
public static void solve(Kattio sc) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        int[] brr = new int[50];
        for(int i = 0; i < n; i++){
            int h = 63 - Long.numberOfLeadingZeros(arr[i]);
            ++brr[h];
        }
        long sum =0L;
        for(int i = 0; i < 50; i++){
            long h = brr[i];
            long gh = h*(h-1)/2;
            sum+=gh;
        }
        sc.println(sum);
    }
}

// modified from https://github.com/Kattis/kattio/blob/master/Kattio.java
class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() {
        return Long.parseLong(nextToken());
    }

    public String next() {
        return nextToken();
    }

    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}