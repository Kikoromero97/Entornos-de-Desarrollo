package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @org.junit.jupiter.api.Test
    void contarvocales1() {
        int resultadoEsperado = Vocales.contarvocales("Hola Mundo");
        assertEquals(4, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void contarvocales2() {
        int resultadoEsperado = Vocales.contarvocales("Esto Es una cadenA");
        assertEquals(8, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void contarvocales3() {
        int resultadoEsperado = Vocales.contarvocales("Java mola MogollOn");
        assertEquals(7, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void contarvocales4() {
        int resultadoEsperado = Vocales.contarvocales("4h0r4 s0n num3r0s");
        assertEquals(1, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void contarvocales5() {
        int resultadoEsperado = Vocales.contarvocales("Cadena S1n Vocales");
        assertEquals(6, resultadoEsperado);
    }
}