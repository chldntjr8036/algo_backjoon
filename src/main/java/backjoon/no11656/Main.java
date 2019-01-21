package backjoon.no11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
백준 11656번 : 접미사 배열
https://www.acmicpc.net/problem/11656
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ls.add(s.substring(i));
        }

        Collections.sort(ls);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ls.size(); i++) {
            sb.append(ls.get(i)+"\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
