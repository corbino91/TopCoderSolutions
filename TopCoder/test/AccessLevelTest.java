import org.junit.*;

import static org.junit.Assert.assertTrue;

public class AccessLevelTest {
    private static AccessLevel accessLevel;

    private static int[] rights0;
    private static int[] rights1;
    private static int[] rights2;
    private static int[] rights3;

    @BeforeClass
    public static void oneTimeSetUp() {
        accessLevel = new AccessLevel();

        rights0 = new int[] {0,1,2,3,4,5};
        rights1 = new int[] {5,3,2,10,0};
        rights2 = new int[] {};
        rights3 = new int[] {34,78,9,52,11,1};
    }

    @Test
    public void testCase0() {
        assertTrue("Result should be DDAAAA", accessLevel.canAccess(rights0, 2).equals("DDAAAA"));
    }

    @Test
    public void testCase1() {
        assertTrue("Result should be DDDDD", accessLevel.canAccess(rights1, 20).equals("DDDDD"));
    }

    @Test
    public void testCase2() {
        assertTrue("Result should be empty", accessLevel.canAccess(rights2, 20).equals(""));
    }

    @Test
    public void testCase3() {
        assertTrue("Result should be DADADD", accessLevel.canAccess(rights3, 49).equals("DADADD"));
    }
}