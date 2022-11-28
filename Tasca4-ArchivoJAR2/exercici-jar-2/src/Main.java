import es.iesmz.prueba.Coche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion = 0, acelerar = 0, frenar = 0;
        String marca = "", modelo = "", color = "";
        Coche nuevo = new Coche("Fiat", "Panda", "Amarillo");
        do {
            System.out.println("Escribe una opción:");
            System.out.println("1.Imprimir datos del coche.");
            System.out.println("2. Pintar el coche.");
            System.out.println("3. Establecer Marca.");
            System.out.println("4. Establecer Modelo.");
            System.out.println("5. Establecer Color.");
            System.out.println("6. Aceleración.");
            System.out.println("7. Frenar.");
            System.out.println("8. Parar.");
            System.out.println("9. Salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    nuevo.imprime();
                    break;
                case 2:
                    nuevo.pinta();
                    break;
                case 3:
                    System.out.println("Introduce la marca:");
                    marca = sc.next();
                    nuevo.setMarca(marca);
                    break;
                case 4:
                    System.out.println("Introduce el modelo:");
                    modelo = sc.next();
                    nuevo.setModelo(modelo);
                    break;
                case 5:
                    System.out.println("Introduce el color:");
                    color = sc.next();
                    nuevo.setColor(color);
                    break;
                case 6:
                    System.out.println("Introduce aceleración:");
                    acelerar = sc.nextInt();
                    nuevo.acelera(acelerar);
                    break;
                case 7:
                    System.out.println("Introduce frenado:");
                    frenar = sc.nextInt();
                    nuevo.frena(frenar);
                    break;
                case 8:
                    nuevo.para();
                case 9:
                    System.out.println("Se va a cerrar el programa.");
                    break;

            }
        } while (opcion != 9);
    }
}