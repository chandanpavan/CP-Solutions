import java.io.*;
import java.util.*;

public class BMonocarpAndProjects {

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
            long x = fs.nextLong();
            long y = fs.nextLong();
            long k = fs.nextLong();

            long res = 0;
            while (k-- > 0) {
                if (y / x == 1) {
                    long val = y % x;
                    res += val * (k + 1);
                    break;
                }
                res += (y % x);
                x++;
                y++;
            }
            System.out.println(res);
        }

    }
}
