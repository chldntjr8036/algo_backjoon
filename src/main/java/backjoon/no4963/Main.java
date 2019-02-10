package backjoon.no4963;


import java.io.*;
import java.util.StringTokenizer;

/*
백준 4963번 섬의 개수
https://www.acmicpc.net/problem/4963
 */
public class Main {
    static int w,h;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {1,1,1,0,0,0,-1,-1,-1};
    static int[] dx = {1,0,-1,1,0,-1,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("testResources/no4963/test.txt"));

        while(true){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) return;
            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            //입력 끝
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(map[i][j] == 1 && !visited[i][j]) {
                        count(i,j); cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void count(int y, int x) {
        if(!isRange(y,x)) return;

        visited[y][x] = true;
        for (int i = 0; i < dy.length; i++) {
            int ny = y+dy[i];
            for (int j = 0; j < dx.length; j++) {
                int nx = x+dx[j];
                if(isRange(ny,nx)&& map[ny][nx] == 1 && !visited[ny][nx]) count(ny, nx);
            }
        }

    }

    private static boolean isRange(int y, int x) {
        if((0 <= y && y < h) &&
                (0 <= x && x < w)) return true;
        else return false;
    }
}
