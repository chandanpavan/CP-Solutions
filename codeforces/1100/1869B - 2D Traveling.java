import java.io.*;
import java.util.*;

public class B2DTraveling {

    static final class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokens = new StringTokenizer("");

        FastScanner(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
        }

        String next() throws IOException {
            while (!tokens.hasMoreTokens())
                tokens = new StringTokenizer(reader.readLine());
            return tokens.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        long testCases = fs.nextLong();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            int a = fs.nextInt() - 1;
            int b = fs.nextInt() - 1;

            long[][] pairs = new long[n][2];

            for (int i = 0; i < n; i++) {
                pairs[i][0] = fs.nextLong();
                pairs[i][1] = fs.nextLong();
            }

            if (a < k && b < k) {
                System.out.println(0);
                continue;
            }

            long min = Long.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                min = Math.min(min, Math.abs(pairs[i][0] - pairs[a][0]) + Math.abs(pairs[i][1] - pairs[a][1]));
            }

            long min2 = Long.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                min2 = Math.min(min2, Math.abs(pairs[i][0] - pairs[b][0]) + Math.abs(pairs[i][1] - pairs[b][1]));
            }

            long direct = Math.abs(pairs[a][0] - pairs[b][0]) + Math.abs(pairs[a][1] - pairs[b][1]);
            if (k == 0) {
                System.out.println(direct);
            } else {
                System.out.println(Math.min(direct, min + min2));
            }
        }
    }
}
