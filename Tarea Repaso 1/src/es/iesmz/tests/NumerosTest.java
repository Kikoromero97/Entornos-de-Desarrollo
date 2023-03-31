package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @org.junit.jupiter.api.Test
    void soniguales1() {
        int resultadoesperado = Numeros.soniguales(4, 55,7);
        assertEquals(2, resultadoesperado);
    }
    @org.junit.jupiter.api.Test
    void soniguales2() {
        int resultadoesperado = Numeros.soniguales(14, 23,27);
        assertEquals(2, resultadoesperado);
    }
    @org.junit.jupiter.api.Test
    void soniguales3() {
        int resultadoesperado = Numeros.soniguales(14, 55,14);
        assertEquals(1, resultadoesperado);
    }
    @org.junit.jupiter.api.Test
    void soniguales4() {
        int resultadoesperado = Numeros.soniguales(14, 14,33);
        assertEquals(1, resultadoesperado);
    }
    @org.junit.jupiter.api.Test
    void soniguales5() {
        int resultadoesperado = Numeros.soniguales(32, 55,55);
        assertEquals(1, resultadoesperado);
    }
    @org.junit.jupiter.api.Test
    void soniguales6() {
        int resultadoesperado = Numeros.soniguales(329, 329,329);
        assertEquals(0, resultadoesperado);
    }
}