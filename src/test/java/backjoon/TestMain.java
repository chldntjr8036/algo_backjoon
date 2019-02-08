package backjoon;

import org.junit.Test;

public class TestMain {
    @Test
    public void test(){
        boolean a = false;
        boolean b = true;
        boolean c = true;

        System.out.println(a &= b);
        System.out.println(b &= c);
    }
}
