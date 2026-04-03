import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int n;
    static int k;
    static int max;

    public static void main(String[] args) throws IOException {

/* =========================입력====================================== */

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        k = Integer.parseInt(st1.nextToken());
        int[] ary = new int[n];
        int[] sum = new int[n-k+1];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<ary.length; i++){
            ary[i]=Integer.parseInt(st2.nextToken());
        }

/* =============================================================== */

        for(int i=0; i<k; i++){
            sum[0] += ary[i];
        }
        max = sum[0];

        for(int i=1; i<n-k+1; i++){
            sum[i] = sum[i-1] + ary[i+k-1] - ary[i-1];
            max = Math.max(sum[i],max);
        }

        System.out.println(max);
    }
}
