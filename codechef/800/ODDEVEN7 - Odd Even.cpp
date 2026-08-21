import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int oddCount = 0;
            int evenCount = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i]%2 == 0) {
                    evenCount++;
                }
                else oddCount++;
            }

            int res = 0;
            if (oddCount == evenCount) {
                res = oddCount+evenCount;
            }
            else{
                res = (Math.min(oddCount,evenCount))*2+1;
            }
            System.out.println(res);
        }
	}
}
