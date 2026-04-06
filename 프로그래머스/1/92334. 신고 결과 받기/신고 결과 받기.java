import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int user_count = id_list.length;
        int [][] matrix = new int[user_count][user_count];


        for(String u: report) {
            StringTokenizer st = new StringTokenizer(u);

            String reporter = st.nextToken();
            String reported_user = st.nextToken();

            int reporter_index = Arrays.asList(id_list).indexOf(reporter);
            int reported_user_index = Arrays.asList(id_list).indexOf(reported_user);

            matrix[reporter_index][reported_user_index]++;
        }

        for(int c=0; c<user_count; c++){
            int count =0;
            for(int r=0; r<user_count; r++){
                if(matrix[r][c] !=0){
                    count ++;
                }
            }
            if(count < k){
                for(int r=0; r<user_count; r++){
                    matrix[r][c]=0;
                }
            }
        }

        int[] answer = new int[user_count];


        for(int r=0; r<user_count; r++){
            int count=0;
            for(int c=0; c<user_count; c++){
                if(matrix[r][c]!=0){
                    count++;
                }
            }
            answer[r]=count;
        }
        return answer;
    }
}