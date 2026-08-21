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
            int[] arr = new int[2*n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 2*n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            int left = 0;
            int right = 2*n-1;
            while (left <= right) {
                sum += arr[left] > arr[right] ? arr[left] :arr[right];
                left++;
                right--;
            }
            System.out.println(sum);
        }
	}
}
