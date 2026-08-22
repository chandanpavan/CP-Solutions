import java.io.*;
import java.util.*;

public class BDivanAndANewProject {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i][0] = i+1;
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
            int res[] = new int[n+1];
            res[0] = 0;
            int index = 0;
            int pos = 1;
            long area = 0;
            while (index < n) {
                if(index < n){
                    res[arr[index][0]] = pos;
                    area += 2L*(pos*(long)arr[index][1]);
                    index++;
                }
                if (index < n) {
                    res[arr[index][0]] = -pos;
                    area += 2L*(pos*(long)arr[index][1]);
                    index++;
                }
                pos++;
            }
            System.out.println(area);
            for (int i : res) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}