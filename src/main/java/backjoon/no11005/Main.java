package backjoon.no11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 11005번 진법 변환 2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<Integer> bl = new ArrayList<>();
        setList(n,b,bl);
//        System.out.println(bl);
//        System.out.println((char)57);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bl.size(); i++) {
            sb.append(convertToBnum(bl.get(i)));
        }
        System.out.println(sb.toString());
    }
    public static String convertToBnum(int n){
        boolean isNum = 0 <= n && n <= 9;
        if(isNum) return String.valueOf(n);
        else{
            return String.valueOf( (char)(n + 55) );
        }
    }

    private static void setList(int n, int b, List<Integer> bl) {
        if(n == 0) return;

        setList(n/b,b,bl);
        bl.add(n%b);
    }
}
