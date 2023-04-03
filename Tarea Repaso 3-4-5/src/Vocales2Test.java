import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @org.junit.jupiter.api.Test
    void contarVocales() {
        assertEquals(Vocales2.sinvocales("Hola Mundo"), "Hl Mnd");
    }

    @org.junit.jupiter.api.Test
    void contarVocales2() {
        assertEquals(Vocales2.sinvocales("Esto Es una cadenA"), "st s n cdn");
    }

    @org.junit.jupiter.api.Test
    void contarVocales3() {
        assertEquals(Vocales2.sinvocales("Java mola MogollOn"), "Jv ml Mglln");
    }

    @org.junit.jupiter.api.Test
    void contarVocales4() {
        assertEquals(Vocales2.sinvocales("4h0r4 s0n num3r0s"), "4h0r4 s0n nm3r0s");
    }

    @org.junit.jupiter.api.Test
    void contarVocales5() {
        assertEquals(Vocales2.sinvocales("Cadena Sin Vocales"), "Cdn Sn Vcls");
    }
}