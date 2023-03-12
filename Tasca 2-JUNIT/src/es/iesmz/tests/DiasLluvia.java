package es.iesmz.tests;

import java.util.Arrays;

public class DiasLluvia {
    private boolean lluvia;
    private static final int dias = 31;
    private static final int meses = 12;
    private boolean[][] calendario;
    private int contador = 0;

    public DiasLluvia() {
        this.calendario = new boolean[dias][meses];

    }

    public boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("No se puede registrar este día.");
            return false;
        }
        if (lluvia == true) {
            System.out.println("Día registrado en el día " + dia + " en el mes " + mes);
            contador++;
            return this.calendario[dia - 1][mes - 1] = lluvia;
        }
        return this.calendario[dia - 1][mes - 1] = lluvia;
    }

    public boolean consultarDia(int dia, int mes) {
        boolean Llovio = true;
        if (calendario[dia - 1][mes - 1]) {
            System.out.println("Este día si ha llovido.");
            return Llovio;
        }
        System.out.println("Este día no ha llovido.");
        return false;
    }

    public int contarDiasLluviosos() {
        System.out.println("Durante todo el año, ha llovido en " + contador + " días.");
        return contador;
    }

    public int trimestreLluvioso() {
        int lluviaTrimestre1 = 0;
        int lluviaTrimestre2 = 0;
        int lluviaTrimestre3 = 0;
        int lluviaTrimestre4 = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[j].length; j++) {
                if (calendario[i][j]) {
                    if (j >= 0 && j < 3) {
                        lluviaTrimestre1++;
                    } else if (j >= 3 && j < 6) {
                        lluviaTrimestre2++;
                    } else if (j >= 6 && j < 9) {
                        lluviaTrimestre3++;
                    } else if (j >= 9 && j < 12) {
                        lluviaTrimestre4++;
                    }
                }
            }
        }
        if (lluviaTrimestre1 > lluviaTrimestre2 && lluviaTrimestre1 > lluviaTrimestre3 && lluviaTrimestre1 > lluviaTrimestre4) {
            System.out.println("El primer trimestre es cuando más ha llovido.");
            return 1;
        } else if (lluviaTrimestre2 > lluviaTrimestre1 && lluviaTrimestre2 > lluviaTrimestre3 && lluviaTrimestre2 > lluviaTrimestre4) {
            System.out.println("El segundo trimestre es cuando más ha llovido.");
            return 2;
        } else if (lluviaTrimestre3 > lluviaTrimestre1 && lluviaTrimestre3 > lluviaTrimestre2 && lluviaTrimestre3 > lluviaTrimestre4) {
            System.out.println("El tercer trimestre es cuando más ha llovido.");
            return 3;
        } else if (lluviaTrimestre4 > lluviaTrimestre1 && lluviaTrimestre4 > lluviaTrimestre2 && lluviaTrimestre4 > lluviaTrimestre3) {
            System.out.println("El cuarto trimestre es cuando más ha llovido.");
            return 4;
        } else {
            System.out.println("No hay ningún trimestre donde haya llovido más dias que otro.");
            return -1;
        }
    }

    public int primerDiaLLuvia() {
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[j].length; j++) {
                if (calendario[i][j]) {
                    System.out.println("El primer día que llovió del año fue el día " + (i + 1) + " del mes " + (j + 1));
                    return (i + 1) + (j + 1);
                }
            }
        }
        System.out.println("No hay ningún día válido registrado con lluvia.");
        return -1;
    }
}