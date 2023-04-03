import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @org.junit.jupiter.api.Test
    void reverso() {
        int [] v = {1,2,3,4,5,6};
        int [] v2 = {6,5,4,3,2,1};
        assertArrayEquals(v2, Vector.reverso(v));
    }

    @org.junit.jupiter.api.Test
    void reverso2() {
        int [] v = {10,12,5,221,6,7};
        int [] v2 = {7,6,221,5,12,10};
        assertArrayEquals(v2, Vector.reverso(v));
    }

    @org.junit.jupiter.api.Test
    void reverso3() {
        int [] v = {5};
        int [] v2 = {5};
        assertArrayEquals(v2, Vector.reverso(v));
    }

    @org.junit.jupiter.api.Test
    void reverso4() {
        int [] v = {5,10,20};
        int [] v2 = {20,10,5};
        assertArrayEquals(v2, Vector.reverso(v));
    }
}