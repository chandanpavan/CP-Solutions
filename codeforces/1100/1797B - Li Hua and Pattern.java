import java.io.*;
import java.util.*;

public class BLiHuaAndPattern {

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
            long k = fs.nextLong();

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = fs.nextInt();
                }
            }

            int upperRow = 0;
            int upperCol = 0;

            int lowerRow = n - 1;
            int lowerCol = n - 1;

            long cnt = 0;
            while (lowerCol > upperCol) {
                for (int i = 0; i < n; i++) {
                    if (arr[upperRow][upperCol] != arr[lowerRow][lowerCol])
                        cnt++;
                    upperRow++;
                    lowerRow--;
                }
                upperRow = 0;
                lowerRow = n - 1;
                upperCol++;
                lowerCol--;
            }
            if (lowerCol == upperCol) {
                for (int i = 0; i < n / 2; i++) {
                    if (arr[upperRow][upperCol] != arr[lowerRow][lowerCol])
                        cnt++;
                    upperRow++;
                    lowerRow--;
                }
            }
            if (cnt > k) {
                System.out.println("NO");
                continue;
            }

            if (n % 2 == 0) {
                if ((k - cnt) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }

        }

    }
}
