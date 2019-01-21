package backjoon.no1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
백준 1406번 에디터
https://www.acmicpc.net/problem/1406
 */
public class Main {
    static Stack<Character> rst, lst;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rst = new Stack<>();  lst = new Stack<>();
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        //스택 초기화
        for (int i = 0; i < s.length(); i++) lst.push(s.charAt(i));
        
        //query 수행
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ql = st.countTokens();
            String q = st.nextToken();
            String adder = (ql != 1) ? st.nextToken() : "";

            if(q.equals("L"))
                if(!lst.isEmpty())rst.push(lst.pop());
            if(q.equals("D"))
                if(!rst.isEmpty()) lst.push(rst.pop());
            if(q.equals("B")){
                if(!lst.isEmpty()) lst.pop();
            }
            if(q.equals("P")) {
                lst.push(adder.charAt(0));
            }
        }

        StringBuilder lsb = new StringBuilder();
        StringBuilder rsb = new StringBuilder();
        while(!rst.isEmpty()) {
            rsb.append(rst.pop());
        }
        while(!lst.isEmpty()) {
            lsb.append(lst.pop());
        }

        System.out.println(lsb.reverse().toString() + rsb.toString());
    }

}
