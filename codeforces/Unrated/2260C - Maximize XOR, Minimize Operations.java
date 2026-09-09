import java.io.*;
import java.util.*;

public class CMaximizeXorMinimizeOperations {

    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st = new StringTokenizer("");

        String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int x = fs.nextInt();
            int y = fs.nextInt();

            int s = x + y;

            for (int d = 1 << 30; d >= 1; d >>= 1) {
                if ((s & d) != 0 && x >= d) {
                    x -= d;
                }
            }

            out.append(s).append(" ").append(x).append("\n");
        }

        System.out.print(out);
    }
}