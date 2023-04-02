package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void reverso1() {
        int v[] = {1,2,3,4,5,6};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido = {6,5,4,3,2,1};
        assertArrayEquals(resultadoObtenido, resultadoEsperado);
    }
    @Test
    void reverso2() {
        int v[] = {10,12,5,221,6,7};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido = {7,6,221,5,12,10};
        assertArrayEquals(resultadoObtenido, resultadoEsperado);
    }
    @Test
    void reverso3() {
        int v[] = {5};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido = {5};
        assertArrayEquals(resultadoObtenido, resultadoEsperado);
    }
    @Test
    void reverso4() {
        int v[] = {5,10,20};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido = {20,10,5};
        assertArrayEquals(resultadoObtenido, resultadoEsperado);
    }
}