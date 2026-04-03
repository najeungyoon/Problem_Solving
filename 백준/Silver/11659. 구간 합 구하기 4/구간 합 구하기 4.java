import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int M;

    static int start_index;
    static int end_index;


    public static void main(String[] args) throws IOException {

/* =========================입력====================================== */

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());

        int[] ary = new int[N];
        int[] ans = new int[M];
        int[] sum = new int[N];


        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i< ary.length; i++){
            ary[i] = Integer.parseInt(st2.nextToken());
        }

        sum[0] = ary[0];
        for(int i=1; i<sum.length; i++){
            sum[i] = sum[i-1]+ary[i];
        }

/* =============================================================== */

        for(int i=0; i<M; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            start_index = Integer.parseInt(st3.nextToken())-1;
            end_index = Integer.parseInt(st3.nextToken())-1;

            if(start_index == 0){
                ans[i] = sum[end_index];
            }else{
                ans[i] = sum[end_index]- sum[start_index-1];
            }
        }

        for(int num:ans){
            System.out.println(num);
        }
    }
}