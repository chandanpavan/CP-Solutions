import java.io.*;
import java.util.*;

public class BMinusTwo {

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
            int oddCount = 0;
            int evenRemainder = 0;
            int oddRemainder = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                if (arr[i] % 2 == 0) {
                    int val = arr[i] / 2;
                    if (val % 2 == 0) {
                        evenRemainder++;
                    } else {
                        oddRemainder++;
                    }
                } else {
                    oddCount++;
                }
            }

            int max1 = Math.max(evenRemainder, oddRemainder);
            int max2 = Math.max(oddCount, max1);
            System.out.println(max2);
        }

    }
}
