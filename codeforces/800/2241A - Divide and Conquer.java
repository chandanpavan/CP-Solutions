import java.io.*;
import java.util.*;

public class ADivideAndConquer {

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
            int a = fs.nextInt();
            int b = fs.nextInt();

            if (a % b == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
