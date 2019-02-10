package backjoon.no2331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
백준 2331번 반복수열
https://www.acmicpc.net/problem/2331

tc1
57 2
4
 */
public class Main {
    static HashMap<Long, Integer> map;
    static int CNT = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); int p = Integer.parseInt(st.nextToken());

        map = new HashMap<>();

        long ans = getLength(n, p);
//        System.out.println(map);
        System.out.println(ans);
    }

    private static long getLength(long n, int p) {
        if(map.containsKey(n)){
            return map.get(n)-1;
        }
        map.put(n, CNT);CNT++;
        long next = next(n,p);

        return getLength(next,p);
    }

    public static long next(long n, int p) {
        long next = 0;

        while(n != 0){
            long r = n % 10;
            next += (long)Math.pow(r,p);
            n /= 10;

        }
        return next;
    }


}
