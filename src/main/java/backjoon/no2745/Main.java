package backjoon.no2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

/*
백준 2745번 진법 변환
https://www.acmicpc.net/problem/2745
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num_B= st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        System.out.println(convert10(num_B,b));

    }
    public static long convert10(String n, int b){
        long sum = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(n.length()-i-1);
            int e = (48 <= c) && (c <= 57) ?
                    Integer.parseInt(String.valueOf(c)) : (int)c - 55;
            sum += Math.pow(b,i) * e;

        }
        return sum;
    }
}
