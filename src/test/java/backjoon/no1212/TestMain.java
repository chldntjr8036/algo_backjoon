package backjoon.no1212;

import org.junit.Test;

public class TestMain {
    @Test
    public void test_sb_api(){
        StringBuilder sb = new StringBuilder();
        sb.append("1234");
        sb.insert(0,"55");
        System.out.println(sb.toString());
    }
}
