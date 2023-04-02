package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @org.junit.jupiter.api.Test
    void sinvocales1() {
        String resultadoEsperado = Vocales2.sinvocales("Hola Mundo");
        assertEquals("Hl Mnd", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void sinvocales2() {
        String resultadoEsperado = Vocales2.sinvocales("Esto Es una cadenA");
        assertEquals("st s n cdn", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void sinvocales3() {
        String resultadoEsperado = Vocales2.sinvocales("Java mola MogollOn");
        assertEquals("Jv ml Mglln", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void sinvocales4() {
        String resultadoEsperado = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        assertEquals("4h0r4 s0n nm3r0s", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void sinvocales5() {
        String resultadoEsperado = Vocales2.sinvocales("Cadena Sin Vocales");
        assertEquals("Cdn Sn Vcls", resultadoEsperado);
    }
}