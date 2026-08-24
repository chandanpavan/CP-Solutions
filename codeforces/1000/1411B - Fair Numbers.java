import java.io.*;
import java.util.*;

public class BFairNumbers {

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
            long num = fs.nextLong();
            int res = 0;
            for (int i = 0; i <= 2520; i++) {
                if (isFair(num+i)) {
                    res = i;
                    break;
                }
            }
            System.out.println(res+num);
        }
    }
    static boolean isFair(long i) {
        long temp = i;
        while (temp > 0) {
            long ch = temp%10;
            if (ch == 0 || ch == 1){
                temp = temp/10;
                continue;
            }
            if (i%ch != 0) return false;
            temp = temp/10;
        }
        return true;
    }
}
