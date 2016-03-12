package com.corbin.topcoder;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class SubstituteTest {
    private static Substitute substitute = new Substitute();

    @Test
    public void testCase0() {
        assertTrue("Result should be 7109", substitute.getValue("TRADINGFEW", "LGXWEV") == 7109);
    }

    @Test
    public void testCase1() {
        assertTrue("Result should be 0", substitute.getValue("ABCDEFGHIJ", "X") == 0);
    }

    @Test
    public void testCase2() {
        assertTrue("Result should be 106", substitute.getValue("CRYSTALBUM", "MMA") == 106);
    }
}
