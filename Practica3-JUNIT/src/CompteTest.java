import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    @org.junit.jupiter.api.Test
    void compruebaIBAN1() {
            Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
            boolean result = c1.compruebaIBAN(c1.getNumCompte());
            assertEquals(true, result);
        }
    @org.junit.jupiter.api.Test
    void compruebaIBAN2() {
        Compte c1 = new Compte("ES6000491500051234567892", "Pedro");
        boolean result = c1.compruebaIBAN(c1.getNumCompte());
        assertEquals(true, result);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN3() {
        Compte c1 = new Compte("ES9420805801101234567891", "Pedro");
        boolean result = c1.compruebaIBAN(c1.getNumCompte());
        assertEquals(true, result);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN4() {
        Compte c1 = new Compte("ES7600246912501234567891", "Pedro");
        boolean result = c1.compruebaIBAN(c1.getNumCompte());
        assertEquals(false, result);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN5() {
        Compte c1 = new Compte("ES4721000418401234567891", "Pedro");
        boolean result = c1.compruebaIBAN(c1.getNumCompte());
        assertEquals(false, result);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN6() {
        Compte c1 = new Compte("ES8200491500051234567892", "Pedro");
        boolean result = c1.compruebaIBAN(c1.getNumCompte());
        assertEquals(false, result);
    }

    @org.junit.jupiter.api.Test
    void generaIBAN1() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");

        String resultadoEsperado = c1.generaIBAN("0030", "2053", "09", "1234567895");
        assertEquals("ES7100302053091234567895", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN2() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");

        String resultadoEsperado = c1.generaIBAN("0049", "2352", "08", "2414205416");
        assertEquals("ES1000492352082414205416", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN3() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
        String resultadoEsperado = c1.generaIBAN("2085", "2066", "62", "3456789011");
        assertEquals("ES1720852066623456789011", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN4() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
        String resultadoEsperado = c1.generaIBAN("2085", "2066", "62", "3456AE9011");
        assertEquals(null, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN5() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
        String resultadoEsperado = c1.generaIBAN("208", "2066", "62", "3456789011");
        assertEquals(null, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN6() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
        String resultadoEsperado = c1.generaIBAN("2080", "20A6", "62", "3456789011");
        assertEquals(null, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN7() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
        String resultadoEsperado = c1.generaIBAN("2080", "2086", "6", "3456789011");
        assertEquals(null, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN8() {
        Compte c1 = new Compte("ES6621000418401234567891", "Pedro");
        String resultadoEsperado = c1.generaIBAN("2080", "2086", "63", "345678911");
        assertEquals(null, resultadoEsperado);
    }
}