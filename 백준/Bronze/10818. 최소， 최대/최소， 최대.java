import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int n;
;
    public static void main(String[] args) throws IOException {

        int min;
        int max;

        n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            ary[i]=Integer.parseInt(st.nextToken());
        }

        min = ary[0];
        max = ary[0];

        for(int num : ary){
            if(num < min){
                min = num;
            }
            if(num> max){
                max = num;
            }
        }
        System.out.println(min+" "+max);

    }
}
