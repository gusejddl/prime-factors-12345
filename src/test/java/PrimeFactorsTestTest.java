
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

class PrimeFactorsTestTest {

    PrimeFactor primefactor;

    @BeforeEach
    void setUp() {
        primefactor = new PrimeFactor();
    }

    @Test
    void testPrimefactorOf1() {
        assertEquals(Arrays.asList(), primefactor.of(1));
    }

    @Test
    void testPrimefactorOf2() {
        assertEquals(Arrays.asList(2),primefactor.of(2));
    }
    @Test
    void testPrimefactorOf3() {
        assertEquals(Arrays.asList(3),primefactor.of(3));
    }
    @Test
    void testPrimefactorOf4() {
        assertEquals(Arrays.asList(2,2),primefactor.of(4));
    }

    @Test
    void testPrimefactorOf6() {
        assertEquals(Arrays.asList(2,3),primefactor.of(6));
    }


    @Test
    void testPrimefactorOf9() {
        assertEquals(Arrays.asList(3,3),primefactor.of(9));
    }

    @Test
    void testPrimefactorOf12() {
        assertEquals(Arrays.asList(2,2,3),primefactor.of(12));
    }
}