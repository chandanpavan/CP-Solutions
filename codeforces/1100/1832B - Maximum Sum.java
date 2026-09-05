import java.io.*;
import java.util.*;

public class BMaximumSum {

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
            long k = fs.nextInt();

            int[] arr = new int[n];
            long totalSum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                totalSum += arr[i];
            }

            Arrays.sort(arr);
            /* Wrong approach */
            // // System.out.println(totalSum);
            // int low = 0;
            // int high = n - 1;
            // while (k-- > 0) {
            // if (arr[low] + arr[low + 1] <= arr[high]) {
            // totalSum -= (arr[low] + arr[low + 1]);
            // // System.out.println(totalSum);
            // low += 2;
            // } else {
            // totalSum -= arr[high];
            // high -= 1;
            // }
            // }

            // 15 22 12 10 13 11
            // sorted - 10 11 12 13 15 22
            // n= 6 k = 2 n-k =4 lastIndex = 3

            /*
             * 5 2
             * 2 5 1 10 6
             * # val = 3 # lastIndex = 2 # n-k = 3 -- high
             */
            long val = n - k;
            long tempSum = 0;
            for (int i = 0; i < n - k; i++) {
                tempSum += arr[i];
            }
            long max = tempSum;
            int low = 0;
            int high = (int) (n - k); // 3
            for (int i = 0; i < k; i++) { // runs for 2 times 0,1
                tempSum -= (arr[low] + arr[low + 1]);
                tempSum += arr[high];
                low += 2;
                high++;
                max = Math.max(max, tempSum);
            }
            System.out.println(max);
        }

    }
}
