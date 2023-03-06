package es.iesmz;

public class EmpleadoBR {
    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) {
        float salariobase = 0;
        if (tipo == TipoEmpleado.vendedor) {
            salariobase = 1000;
        } else if (tipo == TipoEmpleado.encargado) {
            salariobase = 1500;
        }
        if (ventasMes >= 1000 && ventasMes < 1500) {
            salariobase = salariobase + 100;
        } else if (ventasMes >= 1500) {
            salariobase = salariobase + 200;
        }
        salariobase += (20 * horasExtra);
        if (tipo == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }
        return salariobase;
    }

    public static float calculaSalarioNeto (float salarioBruto) {
        float retencion = 0;
        if (salarioBruto >= 1000 && salarioBruto < 1500) {
            retencion = (float) (salarioBruto * 0.16);
            salarioBruto -= retencion;
        } else if (salarioBruto >= 1500) {
            retencion = (float) (salarioBruto * 0.18);
            salarioBruto -= retencion;
        }
        if (salarioBruto < 0) {
            return salarioBruto * (1 - retencion / 100);
        }
            return salarioBruto;
    }
}
