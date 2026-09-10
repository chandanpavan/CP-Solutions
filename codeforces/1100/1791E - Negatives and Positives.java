import java.io.*;
import java.util.*;

public class ENegativesAndPositives {

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
            int negCount = 0;
            long sum = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                if (arr[i] < 0) {
                    negCount++;
                }
                if (Math.abs(arr[i]) < min) {
                    min = Math.abs(arr[i]);
                }
                sum += Math.abs(arr[i]);
            }

            if (negCount % 2 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(sum - 2 * min);
            }
        }

    }
}
