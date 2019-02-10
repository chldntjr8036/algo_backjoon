package backjoon.no9466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
백준 9466번 텀 프로젝트
 */
public class Main {
    static int[] s;
    static boolean[] visited, finished;
    static int[] discovered;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            s = new int[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <=N; j++) s[j] = Integer.parseInt(st.nextToken());
            visited = new boolean[N+1];
            finished = new boolean[N+1];
            discovered = new int[N+1];
            int ans = 0;
            for (int j = 1; j <= N; j++) {
                if(!visited[j]) {
                    int val = dfs(j,1);
                    ans += val;
                }
            }

            System.out.println(ans);

        }
    }

    private static int dfs(int here, int seq) {

        if(visited[here]) {
            if (finished[here]) return seq-1;
            else return discovered[here]-1;
        }

        int there = s[here];
        discovered[here] = seq;
        visited[here] = true;
        int ret =  dfs(there,seq+1);
        finished[here] = true;

        return ret;
    }
}
