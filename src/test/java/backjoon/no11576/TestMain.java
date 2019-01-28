package backjoon.no11576;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
백준 11576번 Base Conversion
https://www.acmicpc.net/problem/11576
 */
public class TestMain {
    @Test
    public void testConvertTo10(){
        List<Integer> al = Arrays.asList(2,16);
        assertEquals(Main.convertTo10(al, 17), 50);
    }
    @Test
    public void testConvertToB(){
        List<Long> bl = new ArrayList<>();
        List<Long> ex = Arrays.asList(6l,2l);
        Main.convertToB(50,8,bl);
        assertEquals(bl, ex);
    }
}
