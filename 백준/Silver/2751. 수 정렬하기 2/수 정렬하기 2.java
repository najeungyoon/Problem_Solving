import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] ary = new int[num];

        for (int i = 0; i < ary.length; i++) {
            ary[i]=Integer.parseInt(br.readLine());
        }

       ary = Arrays.stream(ary).sorted().toArray();
        
        for (int number:ary){
            System.out.println(number);
        }
    }
}