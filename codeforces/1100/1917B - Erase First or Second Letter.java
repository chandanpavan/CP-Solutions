import java.io.*;
import java.util.*;

public class BEraseFirstOrSecondLetter {

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
            String st = fs.next();

            int[] flag = new int[26];
            int res = 0;
            for (int i = 0; i < st.length(); i++) {
                if (flag[st.charAt(i) - 'a'] == 0) {
                    res += n - i;
                }
                flag[st.charAt(i) - 'a']++;
            }
            System.out.println(res);
        }

    }
}

// wrong approach

/*
 * import java.io.*;
 * import java.util.*;
 * 
 * public class BEraseFirstOrSecondLetter {
 * 
 * static final class FastScanner {
 * private final BufferedReader reader;
 * private StringTokenizer tokens = new StringTokenizer("");
 * 
 * FastScanner(InputStream input) {
 * reader = new BufferedReader(new InputStreamReader(input));
 * }
 * 
 * String next() throws IOException {
 * while (!tokens.hasMoreTokens())
 * tokens = new StringTokenizer(reader.readLine());
 * return tokens.nextToken();
 * }
 * 
 * int nextInt() throws IOException {
 * return Integer.parseInt(next());
 * }
 * 
 * long nextLong() throws IOException {
 * return Long.parseLong(next());
 * }
 * }
 * 
 * public static void main(String[] args) throws Exception {
 * FastScanner fs = new FastScanner(System.in);
 * int testCases = fs.nextInt();
 * 
 * while (testCases-- > 0) {
 * int n = fs.nextInt();
 * 
 * String st = fs.next();
 * int res = 1;
 * for (int i = 0; i < st.length() - 1; i++) {
 * if (st.charAt(i) == st.charAt(i + 1)) {
 * res += 1;
 * } else {
 * res += 2;
 * }
 * }
 * System.out.println(res);
 * }
 * 
 * }
 * }
 */
