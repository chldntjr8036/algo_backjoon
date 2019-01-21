package backjoon.no1406;


import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

/*
LinkedList api Test
 */
public class TestMain {
    @Test
    public void testapi(){
        LinkedList<Integer> ll = new LinkedList();
        ll.add(1);ll.add(2); ll.add(3);

        ll.remove(1);
        System.out.println(ll);

        ll.add(1,2);
        System.out.println(ll);
    }

    @Test(timeout = 2000)
    public void testTimeout() {
//        LinkedList<Integer> ll = new LinkedList<>();
        Deque<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 600000; i++) {
            ll.add(i);
        }

//        for (int i = 500000; i >= 0; i--) {
//            ll.remove(i);
//        }
        for (int i = 0; i < 500000; i++) {
            ll.remove(i);
        }

    }

}
