import java.io.*;
import java.util.*;

public class AAddAndDivide {

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
        StringBuilder output = new StringBuilder();
        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            
            int count = 0;
            int min = Integer.MAX_VALUE;
            int prev = Integer.MAX_VALUE;
            while (true) {
                if (b == 1) {
                    count++;
                    b++;
                    continue;
                }
                int ans = 0;
                int temp = a;
                while (temp > 0 ) {
                    temp = temp/b;
                    ans++;
                }
                int res = count+ans;
                min = Math.min(min, res);
                if (count >= 30) {
                    break;
                }
                prev = res;
                b=b+1;
                count++;
            }
            System.out.println(min);
        }

    }
}