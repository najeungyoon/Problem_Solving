import java.util.*;

class Solution {

    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    
    static ArrayDeque<int[]> q = new ArrayDeque<>();
    
    static int[][] visited;
    static int n;
    static int m;
    static int count;
    
    public int solution(int[][] maps) {
        
        n=maps.length;
        m=maps[0].length;
        visited = new int[n][m];
        
        q.addLast(new int[]{0,0});
        visited[0][0] = 1;
        
        count = 0;
        while(!q.isEmpty()){
            int[] cur = q.removeFirst();
            int cr = cur[0];
            int cc = cur[1];
            
            for(int i=0; i<4; i++){
                
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                
                if(nr < 0 || nr >= n || nc<0 || nc>=m)
                    continue;
                if(maps[nr][nc] == 0 || visited[nr][nc] != 0)
                    continue;
                
                
                visited[nr][nc] = visited[cr][cc]+1;
                q.addLast(new int[]{nr,nc});
            }
            if(cr == n-1 && cc == m-1){
                return visited[cr][cc];
            }
            
        }
        return -1;
    }
}