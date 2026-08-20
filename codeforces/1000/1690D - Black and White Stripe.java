import java.io.*;
import java.util.*;

public class DBlackAndWhiteStripe {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine();

            int white = 0;

            // First window
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W')
                    white++;
            }

            int ans = white;

            // Slide the window
            for (int i = k; i < n; i++) {

                if (s.charAt(i - k) == 'W')
                    white--;

                if (s.charAt(i) == 'W')
                    white++;

                ans = Math.min(ans, white);
            }

            System.out.println(ans);
        }
    }
}