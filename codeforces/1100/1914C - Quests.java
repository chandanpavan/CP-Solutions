import java.io.*;
import java.util.*;

public class CQuests {

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
            int k = fs.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            int sum = 0;
            int temp = k;
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
                if (temp > 0) {
                    sum += a[i];
                    temp--;
                }
            }

            int[] maxArr = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = fs.nextInt();
                if (i == 0) {
                    maxArr[i] = b[i];
                    continue;
                }
                maxArr[i] = Math.max(maxArr[i - 1], b[i]);
            }

            int prefixSum = sum;
            int index = (k <= n) ? k - 1 : n - 1;
            int extra = 0;
            if (k > n) {
                extra = k - n;
                sum += maxArr[n - 1] * extra;
            }
            int res = sum;
            while (index > 0) {
                int val = prefixSum - a[index];
                prefixSum -= a[index];
                extra++;
                res = Math.max(res, val + maxArr[index - 1] * extra);
                index--;
            }
            res = Math.max(res, a[0] + b[0] * extra);
            System.out.println(res);
        }

    }
}
