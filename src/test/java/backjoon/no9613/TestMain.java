package backjoon.no9613;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TestMain {


    @Test
    public void test_gcd(){
        int a = 4;
        int b = 26;
        assertThat(Main.gcd(a,b), is(2l));

        int a2 = 26;
        int b2 = 4;
        assertThat(Main.gcd(a2,b2), is(2l));

    }
}
