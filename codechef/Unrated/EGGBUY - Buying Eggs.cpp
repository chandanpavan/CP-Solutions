import java.io.*;
import java.util.*;

class CodeChef {

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

        int a = fs.nextInt();
        int b = fs.nextInt();
        int fuel = fs.nextInt();
        long res = a * 12;
        long res2 = b * 12 + fuel;
        long ans = Math.min(res, res2);

        System.out.println(ans);
    }
}
