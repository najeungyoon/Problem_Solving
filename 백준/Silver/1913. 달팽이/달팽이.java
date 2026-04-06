import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    static int n;
    static int find;

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static int d=0;

    static int[] result = new int[2];

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        find = Integer.parseInt(br.readLine());


        int [][] matrix = new int[n][n];

        int r = n/2;
        int c = n/2;

        int num=1;
        for (int i = 1; i <= n*2-1; i++) {

            // 방향이동하는 횟수 점점 한칸씩 더 이동하면서 회전
            for (int j = 0; j < (i+1)/2; j++) {
                if(find == num){
                    result[0]=r+1;
                    result[1]=c+1;
                }
                matrix[r][c] = num++;

                r += dr[d];
                c += dc[d];
            }
            d = (d+1)%4;
        }



        /* ------------------출력----------------- */
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        for(int n: result){
            System.out.print(n+" ");
        }
        
    }
}