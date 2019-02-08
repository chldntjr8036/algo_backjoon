package backjoon.no10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 10825번 국영수

1. 국어 내림차순
2. 1이 같을 경우 영어 오름차순
3. 2가 같을 경우 수학 내림차순
4. 모든 점수가 같을 경우 사전순 증가
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Grade> gl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            gl.add(new Grade(name, kor, eng, math));
        }

        Collections.sort(gl);
//        System.out.println(gl);

        StringBuilder sb = new StringBuilder();
        for (Grade g : gl) {
            sb.append(g.name+"\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
class Grade implements Comparable<Grade>{
    int kor, math, eng;
    String name;
    Grade(String name, int kor, int eng, int math){
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Grade grade) {
        if(kor < grade.kor){
            return 1;
        }else if(kor == grade.kor){
            if(eng > grade.eng){
                return 1;
            }else if(eng == grade.eng){
                if(math < grade.math){
                    return 1;
                }else if(math == grade.math){
                    return name.compareTo(grade.name);
                } else return -1;
            }else return -1;
        }else return -1;


    }
}
