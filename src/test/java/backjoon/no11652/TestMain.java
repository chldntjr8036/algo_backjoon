package backjoon.no11652;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain {
    @Test(timeout = 1000)
    public void testTreeMap(){
        List<Long> l = Arrays.asList(-1l,1l,1l,2l,3l,4l,5l,5l,5l,6l);
        Collections.sort(l);
        System.out.println(l);

        System.out.println(l.get(1).equals(l.get(2))) ;
        System.out.println(l.get(2) != l.get(3));

    }
}
