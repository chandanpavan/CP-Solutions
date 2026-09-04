import java.io.*;
import java.util.*;

public class ECardboardForPictures {

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
            long val = fs.nextLong();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            long low = 0;
            long high = 1_000_000_000L;
            long res = -1;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long ans = helper(mid, arr, val);
                if (ans == val) {
                    res = mid;
                    break;
                } else if (ans > val) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(res);
        }
    }

    static long helper(long mid, int[] arr, long val) {
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            long side = (arr[i] + (2 * mid));
            res += side * side;
            if (res > val) {
                return res;
            }
        }
        return res;
    }
}
