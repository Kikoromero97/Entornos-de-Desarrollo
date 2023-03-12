import es.iesmz.tests.DiasLluvia;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DiasLluvia c1 = new DiasLluvia();


        c1.registroDia(12, 6, true);
        c1.registroDia(21, 5, true);
        c1.registroDia(1, 4, true);
        c1.registroDia(2, 2, true);
        c1.registroDia(30, 3, true);
        c1.registroDia(18, 7, true);
        c1.registroDia(11, 12, true);

        c1.consultarDia(30, 11);
        c1.consultarDia(22, 10);
        c1.consultarDia(2, 2);
        c1.contarDiasLluviosos();
        c1.primerDiaLLuvia();
        c1.trimestreLluvioso();
    }

}