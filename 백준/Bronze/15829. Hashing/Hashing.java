import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int r = 31;
        int m  =1234567891;

        int length = Integer.parseInt(bf.readLine());
        String input_string = bf.readLine();
        char[] string_ary = input_string.toCharArray();
        long sum = 0;

        for (int i = 0; i < string_ary.length; i++) {
            int char_value = (int) string_ary[i] - 96;

            sum += char_value * (int) Math.pow(r,i);
        }
        System.out.println(sum % m);
    }
}