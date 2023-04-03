import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @org.junit.jupiter.api.Test
    void soniguales() {
        assertEquals(2, Numeros.soniguales(4,55,7));
    }

    @org.junit.jupiter.api.Test
    void soniguales2() {
        assertEquals(2, Numeros.soniguales(14,23,27));
    }

    @org.junit.jupiter.api.Test
    void soniguales3() {
        assertEquals(1, Numeros.soniguales(14,55,14));
    }

    @org.junit.jupiter.api.Test
    void soniguales4() {
        assertEquals(1, Numeros.soniguales(14,14,33));
    }

    @org.junit.jupiter.api.Test
    void soniguales5() {
        assertEquals(1, Numeros.soniguales(32,55,55));
    }

    @org.junit.jupiter.api.Test
    void soniguales6() {
        assertEquals(0, Numeros.soniguales(329,329,329));
    }
}