package backjoon.no10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 그래프 10451번 순열 사이클
https://www.acmicpc.net/problem/10451
 */
public class Main {
    static int[] a;
    static boolean[] visited;
    static int N,K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            N = Integer.parseInt(br.readLine());
            a = new int[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) { a[j] = Integer.parseInt(st.nextToken()); }

            visited = new boolean[N+1];
            int component = 0;
            for (int j = 1; j <= N; j++) {
                if(!visited[j]){
                    dfs(j);
                    component++;
                }
            }
            System.out.println(component);
        }
    }

    private static void dfs(int here) {
        visited[here] = true;
        int there = a[here];
        if (!visited[there]) dfs(there);
    }
}
