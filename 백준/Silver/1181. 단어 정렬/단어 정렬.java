import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Integer sum(String word){
        int sum = 0;

        char[] charAry = word.toCharArray();
        for (char alphabet :charAry){
            sum+=(int) alphabet;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < num; i++) {
            wordSet.add(br.readLine());
        }

        List<String> words = wordSet.stream()
                .sorted((s1,s2)->{
                    if(s1.length() != s2.length()){
                        return s1.length()-s2.length();
                    }else{
                        return s1.compareTo(s2);
                    }
                })
                .collect(Collectors.toList());

        for(String word:words){
            System.out.println(word);
        }
    }
}