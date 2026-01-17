import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static boolean findPrime(int num){
        if(num <2)
            return false;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }

    public static  void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] ary = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count =0;
        for(int i=0; i<num; i++){
            ary[i]=Integer.parseInt(st.nextToken());
            if(findPrime(ary[i])){
                count++;
            }
        }

        System.out.println(count);
    }
}