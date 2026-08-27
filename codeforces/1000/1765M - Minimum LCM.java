import java.io.*;
import java.util.*;

public class MMinimumLcm {

    static final class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokens = new StringTokenizer("");

        FastScanner(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
        }

        String next() throws IOException {
            while (!tokens.hasMoreTokens()) tokens = new StringTokenizer(reader.readLine());
            return tokens.nextToken();
        }

        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int a = 1;
            int b = n-1;

            for(int i=2;i<=n/i;i++){
                if (n%i == 0) {
                    a = n/i;
                    b = n-a;
                    break;
                }
            }
            System.out.println(a+" "+b);
        }

    }
}

// TLE  
// Brute force
/* import java.io.*;

public class MMinimumLcm {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long res = Integer.MAX_VALUE;
            int a1 = 0;
            int b1 = 0;
            for (int i = 1; i <= n/2; i++) {
                int a = i;
                int b = n-i;
                long lcm =  ((long)a/gcd(a,b))*b;
                if (lcm < res) {
                    a1 =a;
                    b1 = b;
                    res = lcm;
                }
            }
            System.out.println(a1+" "+b1);
        }
    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
} */