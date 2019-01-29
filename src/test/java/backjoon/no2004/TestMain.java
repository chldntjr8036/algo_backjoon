package backjoon.no2004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void test_getPower(){
        assertEquals( Main.getPower(25,5),6);
        assertEquals( Main.getPower(25,2),22);
    }
}
