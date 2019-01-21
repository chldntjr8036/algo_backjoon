package backjoon.no11655;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMain {
    @Test
    public void test(){
        char a = 'n';
        System.out.println("a = " + (int)a);
        char b = (char)((int)a + 13);
        System.out.println("b = " + (int)b);

        char c = (char)(97 + ((int)a + 13 - 97)%26);
        System.out.println("c = " + c);
        System.out.println("c = " + (int)c);

    }

}
