package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void nextSecond1() {
        assertEquals(new Time(12, 14, 16), (new Time(12,14,15)).nextSecond());
    }
    @Test
    void nextSecond2() {
        assertEquals(new Time(12, 59, 45), (new Time(12,59,44)).nextSecond());
    }
    @Test
    void nextSecond3() {
        assertEquals(new Time(1, 10, 0), (new Time(1,9,59)).nextSecond());
    }
    @Test
    void nextSecond4() {
        assertEquals(new Time(18, 0, 0), (new Time(17,59,59)).nextSecond());
    }
    @Test
    void nextSecond5() {
        assertEquals(new Time(0, 0, 0), (new Time(23,59,59)).nextSecond());
    }
}