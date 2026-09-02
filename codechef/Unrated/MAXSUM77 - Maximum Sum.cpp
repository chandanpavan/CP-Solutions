import java.io.*;
import java.util.*;

class Codechef {

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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            int val = n - k;
            int sum = 0;
            for (int i = 0; i < val; i++) {
                sum += arr[i];
            }
            // System.out.println(sum);

            int left = 0;
            int right = val;
            int max = sum;
            while (right < n) {
                sum -= arr[left];
                // System.out.println(sum);
                sum += arr[right];
                max = Math.max(sum, max);
                left++;
                right++;
                // System.out.println(val);
                // System.out.println(sum);
            }
            System.out.println(max);
        }

    }
}
