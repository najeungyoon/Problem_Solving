import java.io.*;
import java.util.*;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static List<int[]> list = new ArrayList<>();

    static int n;


    static int count = 0;
    static int last_start = 0;
    static int last_end = 0;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new int[]{start,end});
        }


        // 종료시간을 기준으로 오름차순 정렬
        list.sort((o1,o2)->{
            // 종료시간이 같으면 시작시간으로 오름차순
            if(o1[1] == o2[1]){
                return o1[0]-o2[0];
            }
            else
                return o1[1]-o2[1];
        });

        for (int i = 0; i < n; i++) {
            int[] time = list.get(i);
            int start_time = time[0];
            int end_time = time[1];

            if(last_end <= start_time){
                last_end = end_time;
                count++;
            }
        }

        System.out.println(count);
    }
}