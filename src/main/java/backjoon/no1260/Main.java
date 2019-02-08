package backjoon.no1260;
/*
백준 1260 DFS와 BFS
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //정점의 개수
        int M= Integer.parseInt(st.nextToken()); //간선의 개수
        int V= Integer.parseInt(st.nextToken()); //탐색 시작할 정점의 번호

        //인접 리스트 초기화
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int f= Integer.parseInt(st.nextToken())-1;
            int s= Integer.parseInt(st.nextToken())-1;
            adj.get(f).add(s);
            adj.get(s).add(f);
        }
        //낮은 정점 우선으로 방문하기 위해 정렬
        for (int i = 0; i < N; i++) {
            Collections.sort(adj.get(i));
        }
        StringBuilder sb = new StringBuilder();
        //방문 캐시
        boolean[] vistedDfs = new boolean[N];
//        for (int i = 0; i < adj.size(); i++) {
//            System.out.println(adj.get(i));
//        }
        dfs(sb, adj,vistedDfs, V-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append("\n");

        boolean[] vistedBfs = new boolean[N];
        bfs(sb,adj,vistedBfs,V-1);
        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb.toString());
    }

    public static void bfs(StringBuilder sb, List<List<Integer>> adj,
                           boolean[] visitedBfs, int node) {
        ArrayDeque<Integer> q = new ArrayDeque();
        q.add(node); visitedBfs[node]=true;
        while(!q.isEmpty()){
            int vn = q.poll();

            sb.append((vn+1)+" ");

            for (int i = 0; i < adj.get(vn).size(); i++) {
                int next = adj.get(vn).get(i);
                if(!visitedBfs[next]){
                    visitedBfs[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public static void dfs(StringBuilder sb, List<List<Integer>> adj,
                           boolean[] visted , int node) {
        if(visted[node]) return;

        visted[node] = true;
        sb.append((node+1)+ " ");
        for (int i = 0; i < adj.get(node).size(); i++) {
            dfs(sb,adj,visted,adj.get(node).get(i));
        }
    }
}
