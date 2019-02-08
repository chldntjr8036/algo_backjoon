package backjoon.no11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
백준 11652번 카드

List<Long> 에 저장된 Long 값을 직접 비교할 때 eqauls를 이용하거나 long형으로 바꾼 다음
비교해야한다.  long으로 저장을 해도 Long으로 boxing되기 때문에.

이 부분에서 한참 헤맸다. 주의!!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Long> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(Long.parseLong(br.readLine()));
        }

        Collections.sort(l);

        int maxCnt = 1;
        int cnt = 1;
        long max_cardNum = l.get(0);
        for (int i = 1; i < l.size(); i++) {

            if(!l.get(i-1).equals(l.get(i))){
                cnt = 1;
            }else {
                cnt++;
            }

            if(maxCnt < cnt){
                max_cardNum = l.get(i);
                maxCnt = cnt;
            }
        }
        System.out.println(max_cardNum);
//        System.out.println(maxCnt);
    }
}
