import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int pc;
    static int E;
    static int[][] matrix;

    //DFS
    static boolean[] visited;
    static ArrayDeque<Integer> stack;
    static List<Integer> log;


    public static void main(String[] args) throws IOException {

        /* 초기화 */
        pc = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        matrix = new int[pc+1][pc+1];
        visited = new boolean[pc+1];

        /* 입력으로 인접행렬 초기화 시키기*/
        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start_node = Integer.parseInt(st.nextToken());
            int end_node = Integer.parseInt(st.nextToken());

            matrix[start_node][end_node] = 1;
            matrix[end_node][start_node] = 1;
        }


        /* ===================DFS 시작==========================*/

        stack = new ArrayDeque<>(List.of(1));
        log = new ArrayList<>();

        while(!stack.isEmpty()){
            int cur_node = stack.removeLast();

            if(!visited[cur_node]){
                visited[cur_node]=true;
                log.add(cur_node);
            }

            for(int destination=1; destination < pc+1; destination++){
                if(!visited[destination] && matrix[cur_node][destination] == 1){
                    stack.addLast(destination);
                }
            }
        }

        /*=============출력=================*/

        System.out.println(log.size()-1);

    }
}