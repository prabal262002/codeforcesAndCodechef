import java.util.*;
import java.io.*;
public class D_Range_Sum
{
public static void main(String[] args) throws IOException{
FastReader s = new FastReader();
PrintWriter pw = new PrintWriter(System.out, true);
BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
int t = s.nextInt();
while (t-- > 0) {
int n = s.nextInt();
// !! Start from here !!
int[] arr = new int[n];
int start = n-n/2;
for(int i=0;i<n;i++){
        if(start==n && (n&1)==0) ++start; 
        arr[i] = start++;
}
 if((n&1)!=0) {
    arr[0]-=1;
    arr[n-1]+=1;
    arr[n-2]+=1;
    for(int i=0;i<n;i++){
        System.out.print((arr[i]+2)+" ");
     }
 }
 else   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
 }
 System.out.println();
}
out.flush();
}
// For fast input output
static class FastReader {
BufferedReader br;
StringTokenizer st;
public FastReader()
{ try {br = new BufferedReader(
new FileReader("input.txt"));
PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
System.setOut(out);}
catch(Exception e) { br = new BufferedReader(new InputStreamReader(System.in));}
}
String next()
{
while (st == null || !st.hasMoreElements()) {
try {st = new StringTokenizer(br.readLine());}
catch (IOException e) {
e.printStackTrace();}
}
return st.nextToken();
}
int nextInt() { return Integer.parseInt(next()); }
long nextLong() { return Long.parseLong(next()); }
double nextDouble() {return Double.parseDouble(next()); }
String nextLine()
{
String str = "";
try {
str = br.readLine();
}
catch (IOException e) {
e.printStackTrace();
}
return str;
}
}
// end of fast i/o code
}