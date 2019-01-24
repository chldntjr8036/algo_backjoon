package backjoon.no1373;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestMain {
    @Test
    public void testConverToOctet(){
        String a = "1110";
//        System.out.println((int)'0');
        assertThat(Main.convertOctet(1,a,3), is(6));
    }
}
