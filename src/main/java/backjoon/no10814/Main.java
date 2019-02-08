package backjoon.no10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 10814번 나이순 정렬
https://www.acmicpc.net/problem/10814
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<User> ul = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age= Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            ul.add(new User(cnt++, name, age));
        }
        Collections.sort(ul);
//        System.out.println(ul);
        StringBuilder sb = new StringBuilder();
        for (User user : ul){
            sb.append(user.age + " "+user.name+"\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
class User implements Comparable<User>{
    String name;
    int age, id;
    User(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User user) {
        if(age > user.age) return 1;
        else if(age == user.age){
            if(id > user.id) return 1;
            else return -1;
        }else return -1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
