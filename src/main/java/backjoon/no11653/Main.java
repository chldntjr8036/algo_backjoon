package backjoon.no11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
백준 11653번 소인수분해
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            System.out.println(); return;
        }
        boolean[] check_arr = new boolean[10000001];
        setPrime(10000000, check_arr);
        List<Integer> fl = new ArrayList<>();
        factorize(n,fl,check_arr);

        StringBuilder sb = new StringBuilder();
        for (int f:fl) {
            sb.append(f+"\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void factorize(int n,List<Integer> fl, boolean[] check_arr){
        if(n <= 1) return;
        if(!check_arr[n]) {
            fl.add(n); return;
        }
        for (int i = 2; i <= n; i++) {
            if(n%i == 0){
                fl.add(i);
                factorize(n/i,fl,check_arr);
                break;
            }
        }
    }

    //소수이면 false값을 가지는 배열 , 리스트 set
    public static void setPrime(int upper, boolean[] checkarr){
        for (int i = 2; i <= upper ; i++) {
            if(checkarr[i]) continue;
            for (int j = i*2; j <= upper; j+=i) {
                checkarr[j] = true;
            }
        }
    }
}
