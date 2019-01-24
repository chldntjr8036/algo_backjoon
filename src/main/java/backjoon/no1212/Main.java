package backjoon.no1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
백준 1212번 8진수 2진수 변환
https://www.acmicpc.net/problem/1212
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String octet_n = br.readLine();
        sol(octet_n);
    }

    private static void sol(String octet_n) {
        int leng = octet_n.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < leng; i++) {
            StringBuilder b_part = new StringBuilder();
            convertToBi(octet_n.charAt(i)-48,3, b_part);

            ans.append(b_part.toString());
        }
        trimZero(ans);
        System.out.println(ans.toString());
    }

    public static void trimZero(StringBuilder sb){
        while(true) {
            if(sb.charAt(0) == '0' && sb.length() != 1) sb.deleteCharAt(0);
            else break;
        }
    }
    //8진수 자리수를 받고 세자리 이진수 문자열 반환. 앞이 0일 경우도 포함
    public static void convertToBi(int n, int cnt, StringBuilder sb) {
        if(cnt == 0) return ;

        convertToBi(n/2,cnt-1, sb);
        sb.append(n%2);
    }
}
