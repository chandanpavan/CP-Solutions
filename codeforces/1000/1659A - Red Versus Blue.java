import java.io.*;
import java.util.*;

public class ARedVersusBlue {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[3];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int totalGames = arr[0];
            int redWins = arr[1];
            int blueWins = arr[2];

            int blocks = blueWins+1;
            int counter = redWins/blocks;
            int remainingReds = redWins%blocks;

            int temp = 0;
            for(int i=0;i<totalGames;i++){
                if (temp == counter && blueWins > 0) {
                    if (remainingReds > 0) {
                        sb.append("R");
                        remainingReds--;
                        redWins--;
                        i++;
                    }
                    sb.append("B");
                    temp = 0;
                    blueWins--;
                }
                else{
                    sb.append("R");
                    temp++;
                    redWins--;
                }
            }
            System.out.print(sb);
            System.out.println();
        }

    }
}