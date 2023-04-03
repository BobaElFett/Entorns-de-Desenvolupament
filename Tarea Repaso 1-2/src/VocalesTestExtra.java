import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTestExtra {
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

    @ParameterizedTest
    @CsvSource(value = {
            "4      ,aaaa",
            "2      ,Pepa",
            "4      ,Eres tonto",
            "7      ,Paco es un bon tio"
    })
    void additionTest(int a, String b) {
        assertEquals(a, Vocales.contarvocales(b));
    }

    @ParameterizedTest
    // @CsvSource desde un fichero
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 0)
    void additionTest2(int a, String b) {
        assertEquals(a, Vocales.contarvocales(b));
    }
}