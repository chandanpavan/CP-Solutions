import java.io.*;
import java.util.*;

public class BShoeShuffling {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            HashMap<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                res[i] = i+1;
            }

            boolean valid = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (map.get(arr[i])== 1) {
                    valid = false;
                    break;
                }
                if (arr[i] == arr[i+1]) {
                   int temp = res[i];
                   res[i] = res[i+1];
                   res[i+1] = temp;
                }
            }
            
            if (map.get(arr[arr.length-1]) == 1) {
                valid = false;
            }

            if (!valid || (arr.length == 1)) {
                System.out.println(-1);
            }
            else{
                for (int i = 0; i < res.length; i++) {
                    System.out.print(res[i]+" ");
                }
                System.out.println();
            }
        }

        System.out.print(sb);
    }
}