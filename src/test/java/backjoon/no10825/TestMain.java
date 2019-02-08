package backjoon.no10825;

import org.junit.Test;

/*
백준 10825번 국영수

1. 국어 내림차순
2. 1이 같을 경우 영어 오름차순
3. 2가 같을 경우 수학 내림차순
4. 모든 점수가 같을 경우 사전순 증가
 */
public class TestMain {

    @Test
    public void test_simple(){
        //String compareTo test
        String a = "a";
        String A = "A";
        String b = "b";
        System.out.println(a.compareTo(b)); // a < b 일 경우 -1
        System.out.println(a.compareTo(a)); // a == b 일 경우 0
        System.out.println(b.compareTo(a)); // b < a 일 경우 1
        System.out.println(a.compareTo(A));
        System.out.println(A.compareTo(a));
    }

}
