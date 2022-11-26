import java.util.*;
import java.io.*;
public class C_Almost_All_Multiples
{
public static void main(String[] args) throws IOException{
FastReader s = new FastReader();
PrintWriter pw = new PrintWriter(System.out, true);
BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
int t = s.nextInt();
while (t-- > 0) {
int n = s.nextInt();
// !! Start from here !!
 
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