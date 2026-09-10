import java.io.*;
import java.util.*;

public class BSortTheSubarray {

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
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = fs.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = fs.nextInt();
            }

            int start = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i]) {
                    start = i;
                    break;
                }
            }

            int end = start;
            for (int i = arr1.length - 1; i >= start; i--) {
                if (arr1[i] != arr2[i]) {
                    end = i;
                    break;
                }
            }
            int index = end + 1;
            while (index < n && arr2[index] >= arr2[index - 1]) {
                end++;
                index++;
            }

            index = start - 1;
            while (index >= 0 && arr2[index + 1] >= arr2[index]) {
                index--;
                start--;
            }

            int st = start + 1;
            int en = end + 1;
            System.out.println(st + " " + en);
        }

    }
}
