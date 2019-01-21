package backjoon.no10820;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

/*
백준 10820 문자열 분석
https://www.acmicpc.net/problem/10820
 */
public class Main {
    /*
a_ls = 97
a_le = 122
a_hs = 65
a_he = 90
n_s = 48
n_e = 57
     */
    static int[] a ; // 0 : lower, 1 : high, 2: number, 4 : space
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            List<String> l = br.lines().collect(Collectors.toList());
            for (int i = 0; i < l.size(); i++) {
                String s = l.get(i);
                a = new int[4];
                for (int j = 0; j < s.length(); j++) {
                    a[whichRange(s.charAt(j))]++;
                }

                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < 4; j++) {
                    sb.append(a[j]+" ");
                }
                sb.deleteCharAt(sb.length()-1);
                System.out.println(sb.toString());
            }
    }
    public static int whichRange(char c){
        if(97 <= c && c <= 122) return 0;
        if(65 <= c && c <= 90) return 1;
        if(48 <= c && c <= 57) return 2;
        if(c == 32) return 3;

        return -1;
    }
}
