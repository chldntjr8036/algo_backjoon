package backjoon.no2331;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestMain {

    @Test
    public void test_next(){
        assertEquals(Main.next(57,2), 74l);
        assertEquals(Main.next(74,2), 65l);
    }
    @Test
    public void test_hashmap(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);


    }
}
