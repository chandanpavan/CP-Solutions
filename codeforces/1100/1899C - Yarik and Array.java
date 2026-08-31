import java.io.*;
import java.util.*;

public class CYarikAndArray {

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
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            int l = 0;
            int r = 1;
            int max = arr[0];
            int sum = arr[0];
            if (sum < 0)
                sum = 0;
            boolean preevParity = false;
            if (Math.abs(arr[0]) % 2 == 0) {
                preevParity = true;
            }
            while (l < n && r < n) {
                boolean currParity = false;
                if (Math.abs(arr[r] % 2) == 0) {
                    currParity = true;
                }

                if (preevParity != currParity) {
                    sum += arr[r];
                    max = Math.max(max, sum);
                } else {
                    l = r;
                    sum = arr[l];
                    max = Math.max(max, sum);
                }
                if (sum < 0) {
                    sum = 0;
                }
                r++;
                preevParity = currParity;
            }
            System.out.println(max);
        }

    }
}
