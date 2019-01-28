package backjoon.no11576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 11576번 Base Conversion
https://www.acmicpc.net/problem/11576
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int base_a = Integer.parseInt(st.nextToken());
        int base_b = Integer.parseInt(st.nextToken());

        int m  = Integer.parseInt(br.readLine());

        List<Integer> al = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            al.add(Integer.parseInt(st.nextToken()));
        }
        long temp = convertTo10(al, base_a);

        List<Long> bl = new ArrayList<>();
        convertToB(temp, base_b,bl);
        StringBuilder sb = new StringBuilder();
        for (long e:bl) {
            sb.append(e+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    public static void convertToB(long d, int base_b, List<Long> bl){
        if(d == 0) return;

        convertToB(d/base_b, base_b, bl);
        bl.add(d%base_b);
    }


    public static long convertTo10(List<Integer> al, int base_a){
        long ret = 0;
        for (int i = 0; i < al.size(); i++) {
            ret += Math.pow(base_a, al.size()-i-1) * al.get(i);
        }
        return ret;
    }
}
