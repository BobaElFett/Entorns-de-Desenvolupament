import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @org.junit.jupiter.api.Test
    void nextSecond() {
        Time t = new Time(12,14,15);
        Time t2 = new Time(12,14,16);
        assertEquals(t2, t.nextSecond(t));
    }

    @org.junit.jupiter.api.Test
    void nextSecond2() {
        Time t = new Time(12,59,44);
        Time t2 = new Time(12,59,45);
        assertEquals(t2, t.nextSecond(t));
    }

    @org.junit.jupiter.api.Test
    void nextSecond3() {
        Time t = new Time(1,9,59);
        Time t2 = new Time(1,10,0);
        assertEquals(t2, t.nextSecond(t));
    }

    @org.junit.jupiter.api.Test
    void nextSecond4() {
        Time t = new Time(17,59,59);
        Time t2 = new Time(18,0,0);
        assertEquals(t2, t.nextSecond(t));
    }

    @org.junit.jupiter.api.Test
    void nextSecond5() {
        Time t = new Time(23,59,59);
        Time t2 = new Time(0,0,0);
        assertEquals(t2, t.nextSecond(t));
    }
}