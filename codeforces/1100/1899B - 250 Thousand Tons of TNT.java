import java.io.*;
import java.util.*;

public class B250ThousandTonsOfTnt {

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
        long testCases = fs.nextLong();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            if (n <= 1) {
                System.out.println(0);
                continue;
            }

            ArrayList<Long> list = new ArrayList<>();
            for (long i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            // System.out.println(list);
            long res = 0;
            for (int i = 0; i < list.size(); i++) {
                long max = Long.MIN_VALUE;
                long min = Long.MAX_VALUE;
                long sum = 0;
                long divisions = list.get(i);
                long track = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (track < divisions) {
                        sum += arr[j];
                        track++;
                    } else {
                        max = Math.max(sum, max);
                        min = Math.min(sum, min);

                        track = 1;
                        sum = arr[j];
                    }
                }
                max = Math.max(sum, max);
                min = Math.min(sum, min);
                res = Math.max(res, max - min);
            }
            System.out.println(res);
        }

    }
}
