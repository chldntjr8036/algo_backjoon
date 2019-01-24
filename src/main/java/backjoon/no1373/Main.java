package backjoon.no1373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
백준 1373번 2진수 8진수
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bn = br.readLine();

        List<Integer> ocl = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sol(bn,ocl);
        for (int i = ocl.size()-1; i >= 0; i--) {
            sb.append(ocl.get(i));
        }
        System.out.println(sb.toString());
    }

    public static void sol(String bn, List<Integer> ocl) {
        int n = bn.length();
        int min = n%3;
        if(n >= 3){
            for (int i = n-3; i >= min; i-= 3) {
                ocl.add(convertOctet(i,bn,3));
            }
        }
        //3자리씩 끊어서 남은 나머지 처리
        if(min != 0)ocl.add(convertOctet(0,bn,min));

    }
    //start에서 시작해 뒤에서 세자리까지 8진수 자리값 계산해서 반환
    public static int convertOctet(int start,String bn, int size){
        int oct = 0;
        int baseSize = size-1;
        for (int i = start; i < start+size; i++) {
//            System.out.println((int)Math.pow(2,2-(i-start)));
            oct += (int)Math.pow(2,baseSize-(i-start)) * (bn.charAt(i)-48);
        }
        return oct;
    }



}
