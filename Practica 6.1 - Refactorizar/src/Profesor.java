import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor(int numeroDeTelefono, String nombre, int edad) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
        prestamos = new ArrayList<>();
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + getNumeroDeTelefono());
    }

    public void printTodaLaInformacion() {
        printInformacionPersonal();
        for (Prestamo cadaPrestamo: prestamos) {
            System.out.println(cadaPrestamo);
        }
    }

    public void agregarPrestamos(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
}
