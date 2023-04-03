import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {
    @org.junit.jupiter.api.Test
    void contarvocales() {
        assertEquals(4, Vocales.contarvocales("Hola Mundo"));
    }

    @org.junit.jupiter.api.Test
    void contarvocales2() {
        assertEquals(8, Vocales.contarvocales("Esto Es una cadenA"));
    }

    @org.junit.jupiter.api.Test
    void contarvocales3() {
        assertEquals(7, Vocales.contarvocales("Java mola MogollOn"));
    }

    @org.junit.jupiter.api.Test
    void contarvocales4() {
        assertEquals(1, Vocales.contarvocales("4h0r4 s0n num3r0s"));
    }

    @org.junit.jupiter.api.Test
    void contarvocales5() {
        assertEquals(6, Vocales.contarvocales("Cadena S1n Vocales"));
    }
}