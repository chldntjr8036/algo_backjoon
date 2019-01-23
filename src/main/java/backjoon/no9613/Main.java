package backjoon.no9613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 9613 GCD합
https://www.acmicpc.net/problem/9613
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            for (int j = 0; j < n; j++) a[j] = Integer.parseInt(st.nextToken());

            long sum = 0;
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sum += gcd(a[j], a[k]);
                }
            }
            System.out.println(sum);

        }

    }


    public static long gcd(int a, int b){
        if(a > b) return gcd(b,a);
        if(a == 0) return b;

        return gcd(b%a, a);

    }
}
