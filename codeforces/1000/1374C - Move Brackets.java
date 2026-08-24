import java.io.*;
import java.util.*;

public class CMoveBrackets {

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
            int value = fs.nextInt();
            String s = fs.next();
            
            int min = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    count--;
                    // System.out.println(count);
                    min = Math.min(count, min);
                }
                if (s.charAt(i) == '(') {
                    count++;
                    // System.out.println(count);
                }
            }
            System.out.println(Math.abs(min));
        }
    }
}
