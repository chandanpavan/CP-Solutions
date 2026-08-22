import java.io.*;
import java.util.*;

public class BMexorMixup {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int xor = 0;
            int res = a;
            if ((a-1)%4 == 1) {
                xor = 1;
            }
            else if ((a-1)%4 == 2) {
                xor = a;
            }
            else if ((a-1)%4 == 3) {
                xor = 0;
            }
            else{
                xor = a-1;
            }
            // System.out.println(res);
            if ((xor^b) == a) {
                res += 2;
                System.out.println(res);
            }
            else if (xor == b) {
                System.out.println(res);
            }
            else{
                res += 1;
                System.out.println(res);
            }
        }
    }
}