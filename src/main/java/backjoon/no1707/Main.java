package backjoon.no1707;

import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 1707번 이분 그래프
 */
public class Main {
    static List<List<Integer>> adj;
    static int[] color;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());

            //인접 리스트 초기화
            adj = new ArrayList<>();
            for (int j = 0; j <= N; j++) adj.add(new ArrayList<>());
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
                adj.get(a).add(b); adj.get(b).add(a);
            }


            //전체 노드를 dfs 순회하면서 color 값 기록하기
            color = new int[N+1];
            for (int j = 1; j <= N; j++) {
                if(color[j] == 0) dfs(j,1);
            }
//            System.out.println(Arrays.toString(color));;
            //전체 순회하면서 연속하는 color 노드 찾기
            boolean isBipart= true;
            for (int j = 1; j <= N; j++) {
                for (int k = 0; k < adj.get(j).size(); k++) {
                    int there = adj.get(j).get(k);
                    if(color[j] == color[there]) { isBipart = false; break; }
                }
            }

            System.out.println(isBipart ? "YES" : "NO");
        }
    }

    /*
    check 값
    0 : 미방문
    1 : 빨강
    2 : 파랑
     */
    private static void dfs(int here, int c) {
        if(color[here] != 0) return;

        color[here] = c;
        for (int i = 0; i < adj.get(here).size(); i++) {
            int there = adj.get(here).get(i);
            dfs(there,3-c);
        }

    }
}
