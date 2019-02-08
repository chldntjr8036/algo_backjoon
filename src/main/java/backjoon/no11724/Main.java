package backjoon.no11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 11724번 연결 요소의 개수

 */
public class Main {
    static int N, M;
    static List<List<Integer>> adj;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); M = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b); adj.get(b).add(a);
        }
        //dfs
        visited = new boolean[N+1];
        int component = 0;
        for (int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i); component++;
            }
        }
        System.out.println(component);
    }

    private static void dfs(int here) {
        if(visited[here]) return;

        visited[here] =true;
        for (int i = 0; i < adj.get(here).size(); i++) {
            int there = adj.get(here).get(i);
            if(!visited[there]) dfs(there);
        }

    }
}
