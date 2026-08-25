import java.io.*;
import java.util.*;

public class BValeriiAgainstEveryone {

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
        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();

            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                set.add(arr[i]);
            }
           
            if (set.size() < n) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
