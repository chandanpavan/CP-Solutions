import java.io.*;
import java.util.*;

public class C101 {

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
            int[] arr = new int[n];
            // ArrayList<Integer> negVal = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            boolean[] firstSeen = new boolean[n];
            boolean[] lastSeen = new boolean[n];

            // firstSeen
            boolean seen = false;
            for (int i = 0; i < arr.length; i++) {
                firstSeen[i] = seen;
                if (arr[i] == 1)
                    seen = true;
            }

            // last Seen
            boolean lSeen = false;
            for (int i = arr.length - 1; i >= 0; i--) {
                lastSeen[i] = lSeen;
                if (arr[i] == 1)
                    lSeen = true;
            }

            // negative ones
            boolean[] negSeen = new boolean[n];
            boolean found = false;
            for (int i = n - 1; i >= 0; i--) {
                negSeen[i] = found;
                if (arr[i] == -1) {
                    found = true;
                }
            }

            boolean firstNeg = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == -1) {
                    if (!firstSeen[i] && !firstNeg) {
                        arr[i] = 1;
                        firstNeg = true;
                    } else if (!lastSeen[i] && !negSeen[i]) {
                        arr[i] = 1;
                    } else {
                        arr[i] = 0;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}

// Logic is correct but TLE
// import java.io.*;
// import java.util.*;

// public class C101 {

// static final class FastScanner {
// private final BufferedReader reader;
// private StringTokenizer tokens = new StringTokenizer("");

// FastScanner(InputStream input) {
// reader = new BufferedReader(new InputStreamReader(input));
// }

// String next() throws IOException {
// while (!tokens.hasMoreTokens())
// tokens = new StringTokenizer(reader.readLine());
// return tokens.nextToken();
// }

// int nextInt() throws IOException {
// return Integer.parseInt(next());
// }

// long nextLong() throws IOException {
// return Long.parseLong(next());
// }
// }

// public static void main(String[] args) throws Exception {
// FastScanner fs = new FastScanner(System.in);
// int testCases = fs.nextInt();

// while (testCases-- > 0) {
// int n = fs.nextInt();
// int[] arr = new int[n];
// int firstSeen = -1;
// int lastSeen = -1;
// int negCount = 0;
// boolean flag = false;
// ArrayList<Integer> list = new ArrayList<>();
// ArrayList<Integer> negList = new ArrayList<>();

// for (int i = 0; i < n; i++) {
// arr[i] = fs.nextInt();
// if (arr[i] == 1 && !flag) {
// firstSeen = i;
// list.add(i);
// } else if (arr[i] == 1) {
// lastSeen = i;
// list.add(i);
// }

// if (arr[i] == -1) {
// negCount++;
// negList.add(i);
// }
// }

// if ((firstSeen == -1 || lastSeen == -1) && negCount <= 0) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// continue;
// }

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == -1) {
// // place it at front
// boolean prePresent = false;
// boolean postPresent = false;
// for (Integer val : list) {
// if (val < i) {
// prePresent = true;
// }
// if (val > i) {
// postPresent = true;
// }
// if (prePresent && postPresent) {
// break;
// }
// }
// boolean negPresent = false;
// for (Integer negval : negList) {
// if (negval > i) {
// negPresent = true;
// break;
// }
// }
// if (!prePresent || (!negPresent && !postPresent)) {
// arr[i] = 1;
// list.add(i);
// } else {
// arr[i] = 0;
// }
// }
// }
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// }
// }
