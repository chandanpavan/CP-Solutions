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
        int value = fs.nextInt();
        if (value == 6) {
            System.out.println(4);
        } else if (value == 7) {
            System.out.println(3);
        } else if (value == 8) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }

    }
}
