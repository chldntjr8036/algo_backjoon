package backjoon.no6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
백준 6588번 골드바흐의 추측
https://www.acmicpc.net/problem/6588
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        boolean[] notPrimeArr = new boolean[1000001];
        List<Integer> pl = new ArrayList<>();
        getPrimeSet(1000000, notPrimeArr, pl);
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            for (int i = 0; i < pl.size(); i++) {

                int a = pl.get(i);
                int b = n - a;
                if(a > b) {
                    sb.append("Goldbach's conjecture is wrong.\n"); break;
                }
                if(!notPrimeArr[b]){
                    sb.append(n+" = "+a+" + "+b+"\n");
                    break;
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    //소수이면 false값을 가지는 배열 , 리스트 set
    public static void getPrimeSet(int upper, boolean[] checkarr, List<Integer> pl){
        for (int i = 2; i <= upper ; i++) {
            if(checkarr[i]) continue;
            pl.add(i);
            for (int j = i*2; j <= upper; j+=i) {
                checkarr[j] = true;
            }
        }
    }
}
