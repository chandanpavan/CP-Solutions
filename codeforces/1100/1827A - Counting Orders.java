import java.io.*;
import java.util.*;

public class ACountingOrders {

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
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = fs.nextInt();
            }

            long mod = 1000000007L;
            Arrays.sort(a);
            Arrays.sort(b);

            long res = 1;
            int aPointer = 0;
            int bPointer = 0;
            int counter = 0;

            while (aPointer < n) {
                while (bPointer < n && a[aPointer] > b[bPointer]) {
                    counter++;
                    bPointer++;
                }
                if (counter - aPointer <= 0) {
                    res = 0;
                    break;
                }
                res = (res * (counter - aPointer)) % mod;
                aPointer++;
            }

            System.out.println(res);
        }

    }
}
