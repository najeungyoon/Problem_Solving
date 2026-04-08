import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;

    static PriorityQueue<Integer> maxheap;

    public static void main(String[] args) throws IOException {
        maxheap = new PriorityQueue<>(Comparator.reverseOrder());

        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st=new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num ==0){
                if(maxheap.isEmpty()){
                    System.out.println(0);
                }
                else {
                    System.out.println(maxheap.poll());
                }
            }
            else {
                maxheap.offer(num);
            }
        }
    }
}