package test;

import clases.Cuenta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMonedero {

    @Test
    public void testAlCrearCuentaElSaldoEsCero() {
        Cuenta c1 = new Cuenta(0);
        assertEquals(0,c1.getSaldo());
    }

    @Test
    public void sumarCantidad100() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.ingresar(100);
        assertEquals(100, resultadofinal);
    }

    @Test
    public void sumarCantidad3000() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.ingresar(3000);
        assertEquals(3000, resultadofinal);
    }

    @Test
    public void sumarCantidadConCuenta100() {
        Cuenta c1 = new Cuenta(100);
        double resultadofinal = c1.ingresar(3000);
        assertEquals(3100, resultadofinal);
    }

    @Test
    public void restarCantidad100() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.ingresar(-100);
        assertEquals(0, resultadofinal);
    }

    @Test
    public void ingresoCantidadDecimales() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.ingresar(100.45);
        assertEquals(100.45, resultadofinal);
    }
    @Test
    public void ingresoCantidad6000Vacio() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.ingresar(6000);
        assertEquals(6000, resultadofinal);
    }
    @Test
    public void ingresoCantidad6000Limite() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.ingresar(6000.01);
        assertEquals(0, resultadofinal);
    }

    @Test
    public void retiradaCuenta100() {
        Cuenta c1 = new Cuenta(0);
        double resultadofinal = c1.retirada(100);
        assertEquals(0, resultadofinal);
    }
    @Test
    public void retiradaCuentaMayorDisponible() {
        Cuenta c1 = new Cuenta(200);
        double resultadofinal = c1.retirada(500);
        assertEquals(200, resultadofinal);
    }
    @Test
    public void retiradaCuentaNumeroNegativo() {
        Cuenta c1 = new Cuenta(500);
        double resultadofinal = c1.retirada(-100);
        assertEquals(500, resultadofinal);
    }
    @Test
    public void retiradaCuentaDecimales() {
        Cuenta c1 = new Cuenta(500);
        double resultadofinal = c1.retirada(100.45);
        assertEquals(399.55, resultadofinal);
    }
    @Test
    public void retiradaCuentaMaximo() {
        Cuenta c1 = new Cuenta(7000);
        double resultadofinal = c1.retirada(6000);
        assertEquals(1000, resultadofinal);
    }
    @Test
    public void retiradaCuentaLimite() {
        Cuenta c1 = new Cuenta(7000);
        double resultadofinal = c1.retirada(6000.01);
        assertEquals(7000, resultadofinal);
    }
    @Test
    public void transferencia500A50() {
        Cuenta c1 = new Cuenta(500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencias(100, c2);
        boolean resultadofinal = c1.getSaldo() == 400 && c2.getSaldo() == 150;
        assertEquals(true, resultadofinal);
    }
    @Test
    public void transferenciaMenos100A50() {
        Cuenta c1 = new Cuenta(500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencias(-100, c2);
        boolean resultadofinal = c1.getSaldo() == 500 && c2.getSaldo() == 50;
        assertEquals(true, resultadofinal);
    }
    @Test
    public void transferenciaLimite1() {
        Cuenta c1 = new Cuenta(3500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencias(3000, c2);
        boolean resultadofinal = c1.getSaldo() == 500 && c2.getSaldo() == 3050;
        assertEquals(true, resultadofinal);
    }
    @Test
    public void transferenciaLimite2() {
        Cuenta c1 = new Cuenta(3500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencias(3000.01, c2);
        boolean resultadofinal = c1.getSaldo() == 3500 && c2.getSaldo() == 50;
        assertEquals(true, resultadofinal);
    }
}
