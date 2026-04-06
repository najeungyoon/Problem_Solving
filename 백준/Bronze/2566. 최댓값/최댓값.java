import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int row;
    static int col;
    static int[][] ary = new int[9][9];
    static int max = 0;
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                ary[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(ary[r][c] >= max){
                    max=ary[r][c];
                    row=r+1;
                    col=c+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row+" "+col);
    }
}
