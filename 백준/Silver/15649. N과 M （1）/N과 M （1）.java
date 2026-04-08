import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int m;

    static int[] ary;
    static int[] sel;
    static int[] check;


    static void perm(int depth,int length){
        if(depth == length){
            for(int num : sel){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(check[i] ==0){
                check[i]=1;
                sel[depth] = ary[i];
                perm(depth+1,length);
                check[i]=0;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = i+1;
        }
        check = new int[n];
        sel = new int[m];
        perm(0,m);

    }
}