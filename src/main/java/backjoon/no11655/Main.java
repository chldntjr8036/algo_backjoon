package backjoon.no11655;

import java.io.*;

/*
백준 11655 ROT13
https://www.acmicpc.net/problem/11655

아스키 코드 범위에 따른 형태

a_ls = 97
a_le = 122
a_hs = 65
a_he = 90
n_s = 48
n_e = 57
space = 32

 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isWord = (97 <= c && c <= 122) || (65 <= c && c <= 90);
            if(isWord) {
                int s_idx = 97 <= c && c <= 122 ? 97 : 65;
                char nextC = (int)c+13-s_idx > 25  ? (char)((int)c-13) : (char)((int)c+13);
                ans.append(nextC);
            }
            else ans.append(c);
        }
        System.out.println(ans.toString());
    }

}
