import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String INPUT;


    public static void main(String[] args) throws IOException {

/* =========================입력====================================== */

    INPUT = br.readLine();

    StringBuilder sb = new StringBuilder();
    for(int i= INPUT.length()-1; i>=0; i--){
        sb.append(INPUT.charAt(i));
    }

    if(INPUT.equals(sb.toString())){
        System.out.println(1);
    }else{
        System.out.println(0);
    }

    }
}