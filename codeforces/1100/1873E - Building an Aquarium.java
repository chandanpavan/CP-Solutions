import java.io.*;
import java.util.*;

public class EBuildingAnAquarium {

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
            long k = fs.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            long max = Long.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }

            long low = 0;
            long high = max + k;
            long res = 0;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (helper(mid, arr, k)) {
                    res = Math.max(res, mid);
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(res);
        }
    }

    static boolean helper(long mid, long[] arr, long k) {
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                ans += mid - arr[i];
            }
        }
        if (ans <= k) {
            return true;
        }
        return false;
    }

}

// complicated

/*
 * import java.io.*;
 * import java.util.*;
 * 
 * public class EBuildingAnAquarium {
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
 * int k = fs.nextInt();
 * int[] arr = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = fs.nextInt();
 * }
 * 
 * int[] pge = new int[n];
 * pge = calcPGE(pge, arr);
 * 
 * int[] nge = new int[n];
 * nge = calcNGE(nge, arr);
 * 
 * int max = Integer.MIN_VALUE;
 * for (int i = 0; i < n; i++) {
 * max = Math.max(max, arr[i]);
 * }
 * 
 * int low = 0;
 * int high = max + k;
 * int ans = Integer.MAX_VALUE;
 * 
 * while (low <= high) {
 * int mid = low + (high - low) / 2;
 * if (helper(arr, nge, pge, mid, k)) {
 * high = mid - 1;
 * ans = Math.min(ans, mid);
 * } else {
 * low = mid + 1;
 * }
 * }
 * System.out.println(ans);
 * }
 * }
 * 
 * public static boolean helper(int[] arr, int[] nge, int[] pge, int height, int
 * k) {
 * int n = arr.length;
 * int capacity = 0;
 * for (int i = 0; i < pge.length; i++) {
 * if (nge[i] > height && pge[i] > height) {
 * int min = Math.min(nge[i], pge[i]);
 * capacity += min;
 * } else if (height > arr[i]) {
 * capacity += height - arr[i];
 * }
 * }
 * if (capacity >= k) {
 * return true;
 * } else
 * return false;
 * }
 * 
 * public static int[] calcPGE(int[] pge, int[] arr) {
 * Stack<Integer> st = new Stack<>();
 * int n = arr.length;
 * for (int i = 0; i < n; i++) {
 * if (i == 0) {
 * pge[i] = 0;
 * st.push(arr[i]);
 * continue;
 * }
 * 
 * while (!st.isEmpty() && st.peek() <= arr[i]) {
 * st.pop();
 * }
 * if (st.isEmpty()) {
 * pge[i] = -1;
 * st.push(arr[i]);
 * } else {
 * pge[i] = st.peek();
 * st.push(arr[i]);
 * }
 * }
 * return pge;
 * }
 * 
 * public static int[] calcNGE(int[] nge, int[] arr) {
 * Stack<Integer> st = new Stack<>();
 * int n = arr.length;
 * for (int i = n - 1; i >= 0; i--) {
 * if (i == n - 1) {
 * nge[i] = 0;
 * st.push(arr[i]);
 * continue;
 * }
 * 
 * while (!st.isEmpty() && st.peek() >= arr[i]) {
 * st.pop();
 * }
 * if (st.isEmpty()) {
 * nge[i] = -1;
 * st.push(arr[i]);
 * } else {
 * nge[i] = st.peek();
 * st.push(arr[i]);
 * }
 * }
 * return nge;
 * }
 * }
 */