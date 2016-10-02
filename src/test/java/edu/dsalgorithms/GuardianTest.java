package edu.dsalgorithms;

import edu.dsalgorithm.Guardian;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by elmarce on 01/10/16.
 */
public class GuardianTest {

    @Test
    public void lendKeyTest(){
        Guardian g = new Guardian();
        g.lend();
        assertEquals(9, g.getKeyCount());
    }

    @Test
    public void retrieveKeyTest(){
        Guardian g = new Guardian();
        g.lend();
        g.retrieve();
        assertEquals(10, g.getKeyCount());
    }

    @Test
    public void lendAllKeys() {
        Guardian g = new Guardian();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        g.lend();
        assertEquals(0, g.getKeyCount());
    }

    @Test
    public void retrieveAllKeys() {
        Guardian g = new Guardian();
        g.retrieve();
        assertEquals(10, g.getKeyCount());
    }

    @Test
    public void lendNKeyTest(){
        Guardian g = new Guardian(4);
        g.lend();
        assertEquals(3, g.getKeyCount());
    }
}

