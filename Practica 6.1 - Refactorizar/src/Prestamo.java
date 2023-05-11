public class Prestamo {
    private String tituloLibro;
    private int paginasDelLibro;
    private String fechaDelPrestamo;
    private String fechaDeLaDevolucion;

    public Prestamo(String tituloLibro, int paginasDelLibro, String fechaDelPrestamo, String fechaDeLaDevolucion) {
        this.tituloLibro = tituloLibro;
        this.paginasDelLibro = paginasDelLibro;
        this.fechaDelPrestamo = fechaDelPrestamo;
        this.fechaDeLaDevolucion = fechaDeLaDevolucion;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public int getPaginasDelLibro() {
        return paginasDelLibro;
    }

    public String getFechaDelPrestamo() {
        return fechaDelPrestamo;
    }

    public String getFechaDeLaDevolucion() {
        return fechaDeLaDevolucion;
    }
}
