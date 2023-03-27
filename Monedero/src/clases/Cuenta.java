package clases;

import java.util.Scanner;

public class Cuenta {
    private double saldo;
    private static Scanner sc = new Scanner(System.in);

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double ingresar(double ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            if (this.saldo > 6000) {
                System.err.println("No se puede ingresar más de 6000€.");
                this.saldo -= ingreso;
            } else {
                return this.saldo;
            }
        } else {
            System.err.println("No se puede ingresar una cantidad menor a cero.");
        }
        return this.saldo;
    }

    public double retirada(double retirada) {
        this.saldo -= retirada;
        if (this.saldo < 0 || retirada < 0) {
            this.saldo += retirada;
            System.err.println("No se puede retirar una cantidad menor a cero.");
        } else {
            if (retirada > 6000 && retirada > this.saldo) {
                this.saldo += retirada;
                System.err.println("No se puede retirar una cantidad mayor a la disponible en el saldo.");
            } else {
                if (retirada > 6000) {
                    System.err.println("No se puede retirar más de 6000€.");
                    this.saldo += retirada;
                }
            }
        }
        return this.saldo;
    }

    public double transferencias (double transferencia, Cuenta cuenta) {
        if (transferencia < 0) {
            System.err.println("La transferencia no puede ser menor de cero.");
        } else {
            if (transferencia > 3000) {
                System.err.println("No puede transferirse más de 3000€.");
            } else {
                retirada(transferencia);
                cuenta.ingresar(transferencia);
            }
        }
        return this.saldo;
    }
}

