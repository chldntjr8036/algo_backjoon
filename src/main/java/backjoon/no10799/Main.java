package backjoon.no10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();

        int ans = sol();
        System.out.println(ans);
    }

    private static int sol() {
        Stack<Character> st = new Stack();

        int ret = 0;

        boolean isRazor = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ')') {
               if(isRazor) {
                   st.pop();  ret += st.size();
                   isRazor = false;
               }else {
                   st.pop(); ret += 1;
               }
            }else {
                st.push(c); isRazor = true;
            }
        }
        return ret;
    }
}
