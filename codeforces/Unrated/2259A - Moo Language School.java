import java.io.*;
import java.util.*;

public class AMooLanguageSchool {

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
            int k = fs.nextInt();
            String st = fs.next();

            int temp = k;
            int index = 0;
            int res = 0;
            while (index < n) {
                boolean flag = false;
                while (temp-- > 0) {
                    if (st.charAt(index) == '0') {
                        flag = true;
                    }
                    index++;
                }
                temp = k;
                if (!flag) {
                    res++;
                }
            }
            System.out.println(res);
        }

    }
}
