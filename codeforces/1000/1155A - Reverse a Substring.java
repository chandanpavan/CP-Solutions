import java.io.*;
import java.util.*;

public class AReverseASubstring {

    static final class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokens = new StringTokenizer("");

        FastScanner(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
        }

        String next() throws IOException {
            while (!tokens.hasMoreTokens()) tokens = new StringTokenizer(reader.readLine());
            return tokens.nextToken();
        }

        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();
        String st = fs.next();
        int start = -1;
        int end = -1;
        int flag = 0;

        for (int i = 1; i < st.length(); i++) {
            int prev = st.charAt(i-1)-'a';
            int next = st.charAt(i)-'a';
            if (prev <= next) {
                continue;
            }
            else{
                start = i-1;
                end = i;
                flag = 1;
                break;
            }
        }
        System.out.println(flag == 1? "YES":"NO");
        if (flag == 1) {
            System.out.println((start+1)+ " "+ (int)(end+1));
        }

    }
}
