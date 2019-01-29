package backjoon.no2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 2004번 조합 0의 개수
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long top_2 = getPower(n,2);
        long top_5 = getPower(n,5);

        long bot_2 = getPower(m,2)+getPower(n-m,2);
        long bot_5 = getPower(m,5)+getPower(n-m,5);

        long power2 = top_2 - bot_2;
        long power5 = top_5 - bot_5;

        if(power2 <= 0 || power5 <= 0) System.out.println(0);
        else System.out.println(Math.min(power2, power5));
    }
    public static long getPower(long n, int base){
        long power = 0;
        for (long i = base; i <= n; i*=base) {
            power += n/i;
        }
        return power;
    }
}
