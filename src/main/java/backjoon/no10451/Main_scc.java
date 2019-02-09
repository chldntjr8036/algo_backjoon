package backjoon.no10451;

import java.io.*;
import java.util.*;

public class Main_scc {
    static int[] seq,discovered,gId;
    static Set<Integer> gSet;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            seq = new int[n+1];
            for (int j = 1; j <= n; j++) {
                seq[j] = Integer.parseInt(st.nextToken());
            }
            stack = new Stack<>();
            gSet = new HashSet<>();
            discovered = new int[n+1]; Arrays.fill(discovered,-1);
            gId = new int[n+1]; Arrays.fill(gId,-1);

            seperateGroup(n);
            vCnt =1; gCnt=1;
            System.out.println(gSet.size());
        }


    }

    private static void seperateGroup(int n) {
        for (int i = 1; i <= n; i++) {
            if(discovered[i] == -1) scc(i);
        }
    }
    static int vCnt = 1, gCnt = 1;
    private static int scc(int here) {
        int ret = discovered[here] = vCnt++;
        stack.push(here);

        int there = seq[here];
        if(discovered[there] == -1)
            ret = Math.min(ret, scc(there));
        else if(gId[there] == -1)
            ret = Math.min(ret,discovered[there]);


        if(ret == discovered[here]) {
            while(true) {
                int t = stack.pop();
                gId[t] = gCnt;
                gSet.add(gCnt);
                if(t == here) break;
            }
            gCnt++;
        }
        return ret;
    }


}
