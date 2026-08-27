// code with the TLE logic

import java.io.*;
import java.util.*;

public class BLukeIsAFoodie {

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
            int a = fs.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            
            int prevL = arr[0]-a;
            int prevR = arr[0]+a;
            int cnt = 0;
            for (int i = 1; i < arr.length; i++) {
                int currL = arr[i]-a;
                int currR = arr[i]+a;

                int L = Math.max(prevL, currL);
                int R = Math.min(prevR, currR);

                if (R >= L) {
                    prevL = L;
                    prevR = R;
                }
                else{
                    cnt++;
                    prevL = currL;
                    prevR = currR;
                }
            }
            System.out.println(cnt);
        }

    }
}
