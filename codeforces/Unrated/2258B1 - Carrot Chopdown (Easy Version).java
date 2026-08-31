import java.io.*;
import java.util.*;

public class B1CarrotChopdownEasyVersion {

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
        HashMap<Integer, Integer> map = new HashMap<>();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            // counting the frequency
            int[] cnt = new int[m + 1];
            for (int i = 0; i < arr.length; i++) {
                cnt[arr[i]]++;
            }

            // counting the elements greater than a[i]
            int[] suffix = new int[m + 1];
            int curr = 0;
            for (int i = m; i > 0; i--) {
                // counting how many numbers are greater than a[i]
                curr += cnt[i];
                suffix[i] = curr;
            }

            int max = 0;
            for (int i = 1; i <= m; i++) {
                int res = suffix[i];

                if (2 * i <= m) {
                    res += cnt[2 * i];
                }
                max = Math.max(max, res);
            }
            System.out.println(max);
        }

    }
}

/*
 * import java.io.*;
 * import java.util.*;
 * 
 * public class B1CarrotChopdownEasyVersion {
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
 * int m = fs.nextInt();
 * int max = n;
 * 
 * HashMap<Integer, Integer> map = new HashMap<>();
 * 
 * int[] arr = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = fs.nextInt();
 * map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
 * }
 * 
 * Arrays.sort(arr);
 * for (int i = 0; i < arr.length; i++) {
 * max = Math.max(n - i + map.getOrDefault(arr[i] * 2, 0), max);
 * if (arr[i] > 1) {
 * max = Math.max(map.get(arr[i]) * 2, max);
 * }
 * }
 * 
 * System.out.println(max);
 * }
 * }
 * }
 */