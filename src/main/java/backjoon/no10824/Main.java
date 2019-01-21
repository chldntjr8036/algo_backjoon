package backjoon.no10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 10824번 : 네 수
https://www.acmicpc.net/problem/10824
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            ls.add(st.nextToken());

        long a = Long.parseLong(ls.get(0)+ls.get(1));
        long b = Long.parseLong(ls.get(2)+ls.get(3));
        System.out.println(a+b);

    }
}
