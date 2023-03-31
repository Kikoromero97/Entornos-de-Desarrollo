package es.iesmz.tests;

public class Vocales {
    public static int contarvocales(String cadena) {
        int contador = 0;
        String minusculas = cadena.toLowerCase();
        for (int i = 0; i < minusculas.length(); i++) {
            if (minusculas.charAt(i) == 'a' || minusculas.charAt(i) == 'e' || minusculas.charAt(i) == 'i'
            || minusculas.charAt(i) == 'o' || minusculas.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
