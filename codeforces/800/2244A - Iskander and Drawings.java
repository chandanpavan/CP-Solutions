import java.io.*;
import java.util.*;

public class AIskanderAndDrawings {

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
            String value = fs.next();

            int length = 1;
            boolean found = false;
            int max = 0;
            if (value.contains("#")) {
                found = true;
            }
            for (int i = 0; i < value.length() - 1; i++) {

                if ((value.charAt(i) == value.charAt(i + 1)) && value.charAt(i) == '#') {
                    length++;
                } else {
                    max = Math.max(max, length);
                    length = 1;
                }
            }
            max = Math.max(length, max);
            if (!found) {
                System.out.println(0);
                continue;
            } else {
                if (max % 2 == 0) {
                    System.out.println(max / 2);
                } else {
                    System.out.println((max / 2) + 1);
                }
            }
        }
    }
}
