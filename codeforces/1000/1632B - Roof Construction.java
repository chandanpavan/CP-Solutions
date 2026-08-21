import java.io.*;
import java.util.*;

public class BRoofConstruction {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            // int power = (int)(Math.log(n)/Math.log(2));
            int MSB = Integer.highestOneBit(n - 1);
            for (int i = MSB-1; i >= 0; i--) {
                System.out.print(i+" ");
            }
            for (int i = MSB; i < n; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}