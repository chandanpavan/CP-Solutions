// sliding window approach

import java.io.*;
import java.util.*;

public class DBlackAndWhiteStripe {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine();

            int left = 0;
            int whites = 0;
            int min = 0;

            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') {
                    whites++;
                }
            }
            min = whites;
            for (int i = k; i < s.length(); i++) {
                if (s.charAt(i) == 'B') {
                    if (s.charAt(left) == 'B') {
                        left++;
                    }
                    else{
                        whites--;
                        min = Math.min(min, whites);
                        left++;
                    }
                }
                else{
                    if (s.charAt(left) == 'W') {
                        left++;
                    }
                    else{
                        whites++;
                        left++;
                    }
                }
            }
            System.out.println(min);
        }
    }
}




// TLE

/* import java.io.*;
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
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < n-k+1; i++) {
                int count = 0;
                int temp = 0;
                for (int j = i; j < s.length(); j++) {
                    if (count == k) {
                        break;
                    }
                    if (s.charAt(j) == 'W') {
                        temp++;
                        count++;
                    }
                    else{
                        count++;
                    }
                }
                res = Math.min(res, temp);
            }
            System.out.println(res);
        }

    }
} */