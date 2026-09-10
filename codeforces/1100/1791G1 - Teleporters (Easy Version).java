import java.io.*;
import java.util.*;

public class G1TeleportersEasyVersion {

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
            long c = fs.nextLong();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            // converting the array to respected values
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] + i + 1;
            }

            Arrays.sort(arr);
            int index = 0;
            int ans = 0;
            while (index < n && c - arr[index] >= 0) {
                c = c - arr[index];
                index++;
                ans++;
            }
            System.out.println(ans);
        }

    }
}
