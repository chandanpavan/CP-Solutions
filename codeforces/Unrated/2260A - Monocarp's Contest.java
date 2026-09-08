import java.io.*;
import java.util.*;

public class AMonocarpSContest {

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
        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int[] arr = new int[n];

            int zeroCount = 0;
            boolean firstZero = false;
            boolean lastZero = false;
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                if (arr[i] == 0) {
                    zeroCount++;
                }
                if (i == 0 && arr[i] == 0)
                    firstZero = true;
                if (i == n - 1 && arr[i] == 0)
                    lastZero = true;
            }

            if (zeroCount < 2) {
                System.out.println(-1);
            } else if (firstZero == true && lastZero == true) {
                System.out.println(0);
            } else if (firstZero == true || lastZero == true) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

    }
}
