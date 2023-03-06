package es.iesmz;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    /*  ------------- SALARIO NETO ----------------- */

    @org.junit.jupiter.api.BeforeEach
    void cadaPrueba(){
        System.out.println("EXECUTE PROVA");
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000.0f);
        float resultadoEsperado = 1640.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500.0f);
        float resultadoEsperado = 1230.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1250.0f);
        float resultadoEsperado = 1050.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(500.0f);
        float resultadoEsperado = 500.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(0f);
        float resultadoEsperado = 0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(-1f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    /*  ------------- SALARIO BRUTO ----------------- */

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500.0f, 3.0f);
        float resultadoEsperado = 1260.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0.0f);
        float resultadoEsperado = 1100.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 1250.0f, 8.0f);
        float resultadoEsperado = 1760.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 1000.0f, 0.0f);
        float resultadoEsperado = 1600.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 999.99f, 3.0f);
        float resultadoEsperado = 1560.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 500.0f, 0.0f);
        float resultadoEsperado = 1500.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 0.0f, 8.0f);
        float resultadoEsperado = 1660.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, -1f, 8.0f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto10() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500.0f, -1.0f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioBruto11() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(null, 1500.0f, 8.0f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

}