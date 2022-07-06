package io.datajek.springbootdemo.recommenderapi;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Run this code before all tests");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("Run this code after all tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Initializing before test");
        ArrayMethods arrayMethods = new ArrayMethods();
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("Clean up after test");
    }

    @Test
    public void testfindIndex_numberInArray() {
        //1. create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();

        //2. call method
        int result = arrayMethods.findIndex(new int[]{8, 4, 5}, 5);

        //3. compare the actual results to the expected
        assertEquals(2, result, "The findIndex method finds the index of a given number");
    }

    @Test
    public void testfindIndex_numberNotInArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertEquals(-1, arrayMethods.findIndex(new int[]{8, 4, 5}, 1));
    }

    @Test
    public void testfindIndex_emptyArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1));
    }

    @Test
    public void testsortArray_unsortedArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertArrayEquals(new int[] {0,1,3,7}, arrayMethods.sortArray(new int[] {3,1,7,0}));
    }

    @Test
    void testAssert_True() {
        Boolean condition = true;
        assertEquals(true, condition);
        assertTrue(condition);
    }

    @Test
    void testAssert_Null() {
        String str = null;
        assertEquals(null, str);
        assertNull(str);
    }

    @Test
    @Disabled
    void testunfinishTest_Fail() {
        fail("unimplemented methods");
    }

    @Test
    public void testfindIndex_indexOutOfBound() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->arrayMethods.printArray(
                new int[] {1,8,5}, 3));
    }

    @Test
    public void testfindIndex() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertAll(
                () -> assertEquals(1, arrayMethods.findIndex(new int[]{8,4,5}, 4)),
                () -> assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1)),
                () -> assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1))
        );
    }
}