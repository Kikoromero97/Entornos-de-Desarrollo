package es.iesmz.tests;

public class Time {
    private int hora;
    private int minutos;
    private int segundo;

    public Time(int hora, int minutos, int segundo) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundo = segundo;
    }

    public Time nextSecond() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
        return new Time(hora, minutos, segundo);
    }

    @Override
    public boolean equals(Object TimeRecibido) {
        if (TimeRecibido instanceof Time TimeEntregado) {
            return (this.hora == TimeEntregado.hora && this.minutos == TimeEntregado.minutos && this.segundo == TimeEntregado.segundo);
        }
        return false;
    }
}
