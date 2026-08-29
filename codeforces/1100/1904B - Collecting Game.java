import java.io.*;
import java.util.*;

public class BCollectingGame {

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
            long[][] arr = new long[n][2];
            // taking the input
            for (int i = 0; i < n; i++) {
                arr[i][0] = fs.nextInt();
                arr[i][1] = i;
            }

            // prefix sum

            Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));
            long[] prefix = new long[n];
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][0];
                prefix[i] = sum;
            }

            // traversal
            // using dp
            long[] dp = new long[n];
            dp[n - 1] = n - 1;
            for (int i = n - 2; i >= 0; i--) {
                if (prefix[i] >= arr[i + 1][0]) {
                    dp[i] = dp[i + 1];
                } else {
                    dp[i] = i;
                }
            }

            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[(int) arr[i][1]] = dp[i];
            }

            for (long i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
            // O(n^2) TLE

            /*
             * int[] res = new int[n];
             * for (int i = 0; i < prefix.length; i++) {
             * int count = i;
             * int j = i + 1;
             * int var = prefix[i];
             * while (j < n && var >= arr[j][0]) {
             * count++;
             * var += arr[j][0];
             * j++;
             * }
             * res[arr[i][1]] = count;
             * }
             * for (int i = 0; i < res.length; i++) {
             * System.out.print(res[i] + " ");
             * }
             * System.out.println();
             */
        }
    }
}
