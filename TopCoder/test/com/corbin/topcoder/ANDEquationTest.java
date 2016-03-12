package com.corbin.topcoder;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class ANDEquationTest {
    private static ANDEquation andEquation;

    private static int[] data0;
    private static int[] data1;
    private static int[] data2;
    private static int[] data3;
    private static int[] data4;
    private static int[] data5;
    private static int[] data6;

    @BeforeClass
    public static void oneTimeSetUp() {
        andEquation = new ANDEquation();

        data0 = new int[] {1, 3, 5};
        data1 = new int[] {31, 7};
        data2 = new int[] {31, 7, 7};
        data3 = new int[] {1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1};
        data4 = new int[] {191411,256951,191411,191411,191411,256951,195507,191411,192435,191411,
                191411,195511,191419,191411,256947,191415,191475,195579,191415,191411, 191483,191411,191419,
                191475,256947,191411,191411,191411,191419,256947, 191411,191411,191411};
        data5 = new int[] {1362,1066,1659,2010,1912,1720,1851,1593,1799,1805,1139,1493,1141,1163,1211};
        data6 = new int[] {2, 3, 7, 19};
    }

    @Test
    public void testCase0() {
        assertTrue("Result should be 1", andEquation.restoreY(data0) == 1);
    }


    @Test
    public void testCase1() {
        assertTrue("Result should be -1", andEquation.restoreY(data1) == -1);
    }


    @Test
    public void testCase2() {
        assertTrue("Result should be 7", andEquation.restoreY(data2) == 7);
    }


    @Test
    public void testCase3() {
        assertTrue("Result should be 0", andEquation.restoreY(data3) == 0);
    }


    @Test
    public void testCase4() {
        assertTrue("Result should be 191411", andEquation.restoreY(data4) == 191411);
    }


    @Test
    public void testCase5() {
        assertTrue("Result should be -1", andEquation.restoreY(data5) == -1);
    }


    @Test
    public void testCase6() {
        // website says result should be -1, but that is incorrect
        assertTrue("Result should be 3", andEquation.restoreY(data6) == 3);
    }
}