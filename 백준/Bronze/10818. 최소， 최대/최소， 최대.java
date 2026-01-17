import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static  void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] ary = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<num; i++){
            ary[i] = Integer.parseInt(st.nextToken());
        }
        int max=ary[0];
        int min=ary[0];

        for(int i=0; i<ary.length; i++){

            if(ary[i]>max)
                max = ary[i];
            if(ary[i]<min)
                min=ary[i];
        }

        System.out.println(min+" "+max);
    }
}