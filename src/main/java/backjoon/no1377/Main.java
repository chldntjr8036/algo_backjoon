package backjoon.no1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
백준 1377번 버블 소트
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Pair[] a = new Pair[n];

        for (int i = 0; i < n; i++) {
            a[i] = new Pair(i,Integer.parseInt(br.readLine()));
        }

        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int differ = a[i].i - i + 1;
//            System.out.println("Pair  : "+a[i] + " dif : "+differ);
            ans = Math.max(differ,ans);
        }
        System.out.println(ans);

    }

}
class Pair implements Comparable<Pair> {
    int i, val;
    Pair(int i, int val){
        this.i = i;
        this.val = val;
    }

    @Override
    public int compareTo(Pair p) {
        if(val > p.val) return 1;
        else if(val == p.val) return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "i=" + i +
                ", val=" + val +
                '}';
    }
}
