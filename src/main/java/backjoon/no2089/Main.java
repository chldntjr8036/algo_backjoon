package backjoon.no2089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
백준 2089번 -2진수
https://www.acmicpc.net/problem/2089
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        sol(n);
    }

    private static void sol(Long n) {
        List<Long> l = new ArrayList<>();
        convertToMinusBinaryNum(n,l);
//        System.out.println(l);
        StringBuilder sb = new StringBuilder();
        if(l.size() == 0) {
            System.out.println(0); return;
        }
        for (long e : l) {
            sb.append(e);
        }

        System.out.println(sb.toString());
    }


    private static void convertToMinusBinaryNum(Long n, List<Long> l) {
        if(n == 0) return;

        long r = n % (-2); long d = n / (-2);
        if(r == -1){ d++; r=1; }
        convertToMinusBinaryNum(d,l);
        l.add(r);
    }
}
