import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int xr = Integer.parseInt(st.nextToken());
            int yr = Integer.parseInt(st.nextToken());
            int days = Integer.parseInt(st.nextToken());

            int food = x/xr;
            int water = y/yr;

            int res = Math.min(food, water);
            if (res >= days) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


	}
}
