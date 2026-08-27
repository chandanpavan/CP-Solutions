import java.io.*;
import java.util.*;

public class BDifferentDivisors {

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
            int a = fs.nextInt();
            
            long p = nextPrime(a+1);
            long q = nextPrime(p+a);

            System.out.println(p*q);
        }

    }
    static long nextPrime(long n) {
        boolean isPrime = false;
        long res = -1;
        while (!isPrime) {
            if (n == 2) {
                isPrime = true;
                res = 2;
                continue;
            }
            if(n<2 || n%2 == 0) {
                n = n+1 ;
                continue;
            }
            int flag = 1;
            for (int i = 3; i <= n/i; i+=2) {
                if (n%i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                isPrime = true;
                res = n;
            }
            n += 1;
        }
        return res;
    }
    
}





// wrong logic


/* import java.io.*;
import java.util.*;

public class BDifferentDivisors {

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
            int value = fs.nextInt();
            int res = 1;
            int tracker = 1;
            for (int i = 1; i <= 3; i++) {
                res *= tracker;
                tracker += value;
            }
            System.out.println(res);
        }
    }
}
 */