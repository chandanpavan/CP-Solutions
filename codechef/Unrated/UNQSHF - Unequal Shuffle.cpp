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
        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            String st1 = fs.next();
            String st2 = fs.next();

            int aCount1 = 0;
            int bCount1 = 0;
            for (int i = 0; i < st1.length(); i++) {
                if (st1.charAt(i) == 'a') {
                    aCount1++;
                } else {
                    bCount1++;
                }
            }

            int aCount2 = 0;
            int bCount2 = 0;

            for (int i = 0; i < st2.length(); i++) {
                if (st2.charAt(i) == 'a') {
                    aCount2++;
                } else {
                    bCount2++;
                }
            }

            if ((aCount1 == bCount2) && (aCount2 == bCount1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
