import java.io.*;
import java.util.*;

public class AJohnnyAndAncientComputer {

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
        long testCases = fs.nextLong();

        while (testCases-- > 0) {
            long a = fs.nextLong();
            long b = fs.nextLong();

            if (a%b != 0 && b%a != 0) {
                // System.out.println("first");
                System.out.println(-1);
                continue;
            }
            if (a == b) {
                System.out.println(0);
                continue;
            }

            if (b < a) {
                long temp = b;
                b = a;
                a = temp;
            }

            long eightCount = 0;
            long fourCount = 0;
            long twoCount = 0;

            long temp = a;
            while (temp <= b) {
                // System.out.println("entered while loop");
                if (temp*8 <= b) {
                    eightCount++;
                    temp *= 8;
                }
                else if (temp*4 <= b ) {
                    fourCount++;
                    temp *= 4;
                }
                else if (temp*2 <= b) {
                    twoCount++;
                    temp *= 2;
                }
                else{
                    break;
                }
            }

            if (temp == b) {
                System.out.println(eightCount+fourCount+twoCount);
            }
            else{
                // System.out.println("second");
                // System.out.println(temp); // 5
                // System.out.println(a); // 5
                // System.out.println(b); // 10
                System.out.println(-1);
            }
        }

    }
}
