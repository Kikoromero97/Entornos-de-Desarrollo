package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    // Registrar Dia -- Equals

    @org.junit.jupiter.api.Test
    void registroDia1() {
        DiasLluvia dialluvia = new DiasLluvia();
        boolean resultadoReal = dialluvia.registroDia(12,11, true);
        assertEquals(true, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void registroDia2() {
        DiasLluvia dialluvia = new DiasLluvia();
        boolean resultadoReal = dialluvia.registroDia(1,5, false);
        assertEquals(false, resultadoReal);
    }
    // Registrar Dia -- Not Equals


    @org.junit.jupiter.api.Test
    void registroDia3() {
        DiasLluvia dialluvia = new DiasLluvia();
        boolean resultadoReal = dialluvia.registroDia(2,15, true);
        assertNotEquals(true, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void registroDia4() {
        DiasLluvia dialluvia = new DiasLluvia();
        boolean resultadoReal = dialluvia.registroDia(-1,10, true);
        assertNotEquals(true, resultadoReal);
    }

    // Consultar Dia -- Equals

    @org.junit.jupiter.api.Test
    void consultarDia1() {
        DiasLluvia dialluvia = new DiasLluvia();
        dialluvia.registroDia(12, 12, true);
        boolean resultadoReal = dialluvia.consultarDia(12, 12);
        assertEquals(true, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void consultarDia2() {
        DiasLluvia dialluvia = new DiasLluvia();
        dialluvia.registroDia(1, 1, false);
        boolean resultadoReal = dialluvia.consultarDia(12, 12);
        assertEquals(false, resultadoReal);
    }

    // Consultar Dia -- Not Equals

    @org.junit.jupiter.api.Test
    void consultarDia3() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(17, 3, true);
        assertNotEquals(false, diasLluvia.consultarDia(17, 3));
    }
    @org.junit.jupiter.api.Test
    void consultarDia4() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(6, 7, false);
        assertNotEquals(true, diasLluvia.consultarDia(6, 7));
    }

    // Dias Lluviosos -- Equals

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos1() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(12, 12, true);
        int resultadoEsperado = 1;
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos2() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(12, 12, true);
        diasLluvia.registroDia(11, 2, true);
        diasLluvia.registroDia(17, 3, false);
        diasLluvia.registroDia(9, 5, false);
        int resultadoEsperado = 2;
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    // Dias Lluviosos Dia -- Not Equals

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos3() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(12, 12, false);
        diasLluvia.registroDia(11, 2, false);
        int resultadoEsperado = 2;
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void contarDiasLluviosos4() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(12, 12, false);
        diasLluvia.registroDia(11, 2, true);
        diasLluvia.registroDia(-1, 2, true);
        int resultadoEsperado = 2;
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    // Trimestre Lluvioso -- Equals


    @org.junit.jupiter.api.Test
    void trimestreLluvioso1() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(2, 2, true);
        diasLluvia.registroDia(3, 2, true);
        diasLluvia.registroDia(4, 2, true);
        diasLluvia.registroDia(5, 5, true);
        diasLluvia.registroDia(6, 1, true);
        diasLluvia.registroDia(7, 3, true);
        diasLluvia.registroDia(8, 8, true);
        diasLluvia.registroDia(9, 9, true);
        int resultadoEsperado = 1;
        int resultadoReal = diasLluvia.trimestreLluvioso();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso2() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(2, 2, false);
        diasLluvia.registroDia(3, 2, false);
        diasLluvia.registroDia(4, 2, false);
        diasLluvia.registroDia(15, 5, false);
        diasLluvia.registroDia(6, 1, true);
        diasLluvia.registroDia(17, 3, false);
        diasLluvia.registroDia(18, 8, true);
        diasLluvia.registroDia(19, 7, true);
        int resultadoEsperado = -1;
        int resultadoReal = diasLluvia.trimestreLluvioso();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    // Trimestre Lluvioso -- Not Equals

    @org.junit.jupiter.api.Test
    void trimestreLluvioso3() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(2, 2, false);
        diasLluvia.registroDia(3, 2, false);
        diasLluvia.registroDia(4, 2, false);
        diasLluvia.registroDia(15, 5, false);
        diasLluvia.registroDia(6, 1, true);
        diasLluvia.registroDia(17, 3, false);
        diasLluvia.registroDia(18, 14, true);
        diasLluvia.registroDia(-2, 7, true);
        int resultadoEsperado = -1;
        int resultadoReal = diasLluvia.trimestreLluvioso();
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso4() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, -2, false);
        diasLluvia.registroDia(2, 2, false);
        diasLluvia.registroDia(3, 2, false);
        diasLluvia.registroDia(4, 19, true);
        diasLluvia.registroDia(15, 4, true);
        diasLluvia.registroDia(6, 1, true);
        diasLluvia.registroDia(17, 3, false);
        diasLluvia.registroDia(18, 7, true);
        diasLluvia.registroDia(-2, 7, true);
        int resultadoEsperado = 2;
        int resultadoReal = diasLluvia.trimestreLluvioso();
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    // Primer Dia Lluvia -- Equals

    @org.junit.jupiter.api.Test
    void primerDiaLLuvia1() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(4, 7, true);
        diasLluvia.registroDia(2, 2, false);
        diasLluvia.registroDia(7, 4, true);
        int resultadoEsperado = 11;
        int resultadoReal = diasLluvia.primerDiaLLuvia();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void primerDiaLLuvia2() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(-1, 1, true);
        diasLluvia.registroDia(6, 12, false);
        diasLluvia.registroDia(3, 4, false);
        int resultadoEsperado = -1;
        int resultadoReal = diasLluvia.primerDiaLLuvia();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    // Primer Dia Lluvia -- Not Equals

    @org.junit.jupiter.api.Test
    void primerDiaLLuvia3() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(12, -1, true);
        diasLluvia.registroDia(6, 12, false);
        diasLluvia.registroDia(1, 1, false);
        int resultadoEsperado = 1;
        int resultadoReal = diasLluvia.primerDiaLLuvia();
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void primerDiaLLuvia4() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(8, 8, true);
        diasLluvia.registroDia(6, 19, true);
        diasLluvia.registroDia(32, 1, true);
        int resultadoEsperado = 33;
        int resultadoReal = diasLluvia.primerDiaLLuvia();
        assertNotEquals(resultadoEsperado, resultadoReal);
    }
}