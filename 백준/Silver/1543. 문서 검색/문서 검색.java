import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String word;
    static String find_w;
    static int ans = 0;

    public static void main(String[] args) throws IOException {

        word = br.readLine();
        find_w = br.readLine();

        int n = word.length();
        int m = find_w.length();

        for(int i=0; i<n-m+1; i++){
            int count = 0;

            for(int j=0; j<m; j++){
                if(word.charAt(i+j) == find_w.charAt(j)){
                    count++;
                }else{
                    break;
                }

            }
            if(count == m){
                ans++;
                i+=m-1;
            }
        }
        System.out.println(ans);
    }
}