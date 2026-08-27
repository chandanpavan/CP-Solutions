import java.io.*;
import java.util.*;

public class BTrianglesOnARectangle {

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
        long testCases = fs.nextInt();

        while (testCases-- > 0) {
            long w = fs.nextInt();
            long h = fs.nextInt();
            long maxArea = 0;
            
            for (int i = 0; i < 4; i++) {
                int n = fs.nextInt();
                long min = Integer.MAX_VALUE;
                long max = Integer.MIN_VALUE;
       
                while (n-- > 0) {
                    long value = fs.nextInt();
                    min = Math.min(min, value);
                    max = Math.max(max, value);
                }
                long base = max -min;
                if (i < 2) {
                    long area = base*h;
                    maxArea = Math.max(area, maxArea);
                }else{
                    long area = base*w;
                    maxArea = Math.max(area, maxArea);
                }
            }
            System.out.println(maxArea);
        }
    }
}
