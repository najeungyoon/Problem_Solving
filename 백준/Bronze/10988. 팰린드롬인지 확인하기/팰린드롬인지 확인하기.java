import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String input;
    static int ans=1;

    public static void main(String[] args) throws IOException {

        /* =========================입력====================================== */

        input = br.readLine();
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                ans=0;
                break;
            }
        }
        System.out.println(ans);

    }
}