package calcultion;


import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {


    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,Calculate.findMax(new int[]{1,3,4,2}));
        assertEquals(-2,Calculate.findMax(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27,Calculate.cube(3));
    }
    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        Assertions.assertEquals("ym eman si noraT ",Calculate.reverseWord("my name is Taron"));
    }
    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }
}