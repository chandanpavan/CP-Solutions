import java.io.*;
import java.util.*;

public class BNumbersBox {

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
            int rows = fs.nextInt();
            int cols = fs.nextInt();

            int total = rows*cols;
            long sum = 0;
            int min = Integer.MAX_VALUE;
            int negCount = 0;
            
            for (int i = 0; i < total; i++) {
                int el = fs.nextInt();
                sum += Math.abs(el);
                min  = Math.min(min,Math.abs(el));    
                if (el < 0) {
                    negCount++;
                }
            }

            if (negCount%2 == 0) {
                System.out.println(sum);
            }
            else{
                System.out.println(sum-2*min);
            }

        }

    }
}
