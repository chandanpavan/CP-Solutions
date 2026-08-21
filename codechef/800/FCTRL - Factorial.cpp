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
            int res = 0;
            while (n > 0) {
                n /= 5;
                res += n;
            }
            System.out.println(res);
        }
	}
}
