package backjoon.no11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 11650번 좌표 정렬하기
https://www.acmicpc.net/problem/11650
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Position> pl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pl.add(new Position(x,y));
        }
        Collections.sort(pl);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pl.size(); i++) {
            Position p = pl.get(i);
            sb.append(p.x+" "+p.y+"\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
class Position implements Comparable<Position>{
    int y,x;
    public Position(int x, int y){
        this.y = y;
        this.x = x;
    }

    @Override
    public int compareTo(Position p) {
        if(y > p.y) return 1;
        else if( y == p.y) {
            if(x > p.x) return 1;
            else return -1;
        }else return -1;
    }

    @Override
    public String toString() {
        return "Position{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }
}
