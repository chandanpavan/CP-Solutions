/* /* import java.io.*;
import java.util.*;

public class ABuyingTorches {

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
            int sticks = fs.nextInt();
            int coal = fs.nextInt();
            int torches = fs.nextInt();
            int totalSticks = 
        }

    }
} */



import java.io.*;
import java.util.*;

public class ABuyingTorches {

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

        long nextlong() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        long testCases = fs.nextlong();

        while (testCases-- > 0) {
            long sticks = fs.nextlong();
            long coals = fs.nextlong();
            long torches = fs.nextlong();
            
            long stick_trades_for_torch;
            long stick_trades_for_coal;
            // long coal_trades_for_torch;

            long temp = torches-1;
            long margin = sticks-1;
            long extraSticks = 0;
            if (temp <= margin) {
                stick_trades_for_torch = 1;
                extraSticks = margin-temp;
            }
            else{
                stick_trades_for_torch = temp%margin == 0 ? temp/margin : temp/margin+1;
                extraSticks = stick_trades_for_torch*margin-temp;
            }

            if (extraSticks/coals >= torches) {
                stick_trades_for_coal = 0;
            }else{
                long sticks_required = coals*torches;
                sticks_required -= extraSticks;
                stick_trades_for_coal = sticks_required%margin == 0 ? sticks_required/margin : sticks_required/margin+1;
            }

            long total_trades = stick_trades_for_coal+stick_trades_for_torch+torches;
            System.out.println(total_trades);
        }

    }
}
