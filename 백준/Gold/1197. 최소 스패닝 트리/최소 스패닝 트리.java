import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{

    long distance;
    int nodeNum;

    public Node(long distance, int nodeNum) {
        this.distance = distance;
        this.nodeNum = nodeNum;
    }

    @Override
    public int compareTo(Node o) {
        return Long.compare(this.distance,o.distance);
    }
}


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int V;
    static int E;
    //최소힙
    static PriorityQueue<Node> pq = new PriorityQueue<>();
    static long inf = Long.MAX_VALUE;


    static ArrayList<Node>[] adj; // 인접 리스트
    static boolean[] visited; // 방문여부
    static long[] dist; // 노드 가중치 배열



    static void prim(){
        pq.offer(new Node(0,1));
        dist[1] = 0;

        while(!pq.isEmpty()) {
            Node cur = pq.poll();
            int nodeNum = cur.nodeNum;

            if (!visited[nodeNum]) {
                visited[nodeNum] = true;
            } else {
                continue;
            }

            for (Node next : adj[nodeNum]) {
                int nextNode = next.nodeNum;
                long nextDist = next.distance;

                if (!visited[nextNode] && dist[nextNode] > nextDist) {
                    dist[nextNode] = nextDist;
                    pq.offer(new Node(nextDist, nextNode));
                }

            }
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        visited = new boolean[V+1];

        adj = new ArrayList[V+1];
        dist = new long[V+1];
        for (int i = 0; i < V+1; i++) {
            adj[i] = new ArrayList<>();
            dist[i] = inf;
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            long weight = Integer.parseInt(st.nextToken());
            adj[start].add(new Node(weight, end));
            adj[end].add(new Node(weight, start));
        }

        prim(); // 프림 알고리즘 시행

        long cnt = 0L;
        for (long d : dist) {
            cnt += d;
        }
        cnt -= inf; // 0번 인덱스 빼고

        System.out.println(cnt);
    }
}